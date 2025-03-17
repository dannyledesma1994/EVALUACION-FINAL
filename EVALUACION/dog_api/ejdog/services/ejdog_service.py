import requests

def get_all_ejdog():
    url = "https://dogapi.dog/docs/api-v2"  # Obtener hasta 1000 Pokémon

    try:
        response = requests.get(url)
        response.raise_for_status()
        data = response.json()
        
        ejdog = []

        for item in data["results"]:
            ejdog_data = requests.get(item["url"]).json()
            
           ejdog_info = {
                "name": ejdog_data["name"].capitalize(),
                "image_url": ejdog_data["sprites"]["front_default"],
                "description": f"Tipo: {', '.join(t['type']['name'] for t in ejdog_data['types'])}"
            }
            
           ejdog.append(ejdog_info)
        
        return ejdog 
    
    except requests.exceptions.RequestException as req_err:
        print(f"Request error: {req_err}")  
    except ValueError as json_err:
        print(f"JSON decode error: {json_err}")  

    return []  


def get_ejdog_by_name(name):
    url = f"https://dogapi.dog/docs/api-v2/{name.lower()}"  

    try:
        response = requests.get(url)
        response.raise_for_status()
        data = response.json()

        return [{
            "name": data["name"].capitalize(),
            "image_url": data["sprites"]["front_default"],
            "description": f"Tipo: {', '.join(t['type']['name'] for t in data['types'])}"
        }]
    
    except requests.exceptions.RequestException:
        return []  # Si el Pokémon no existe, retornar una lista vacía

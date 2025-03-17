import requests
from django.http import HttpResponse
from django.shortcuts import render

def ejdog_list(request):
    try:
        # Realiza la solicitud a la API
        response = requests.get('https://dogapi.dog/docs/api-v2')

        # Verifica si la respuesta fue exitosa (código de estado 200)
        if response.status_code == 200:
            try:
                # Intenta convertir la respuesta a JSON
                data = response.json()  # Esto es donde puede fallar

                # Si la respuesta es válida, procesamos los datos
                return render(request, 'ejdog_list.html', {'data': data})
            except ValueError:
                # Si no se puede decodificar como JSON
                return HttpResponse("Error al procesar la respuesta. No es un JSON válido.", status=500)
        else:
            # Si la API devuelve un error (código de estado diferente a 200)
            return HttpResponse(f"Error en la solicitud a la API. Código de estado: {response.status_code}", status=response.status_code)
    except requests.RequestException as e:
        # Si ocurre un error con la solicitud
        return HttpResponse(f"Hubo un problema al realizar la solicitud: {e}", status=500)

from django.urls import path
from .views import ejdog_list

urlpatterns = [
    path('', ejdog_list, name='ejdog_list'),
]

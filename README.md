# pr06-lazy-components-deanmartin_gerardjalon

## Introducción

La aplicación se basa en el universo del juego **Dungeons & Dragons (DND)**, ambientado en dragones y mazmorras, donde existen numerosos elementos que conforman su mundo, siendo los **monstruos** uno de los más importantes.

En este primer trabajo se ha simulado el consumo de una **API de DND**, hardcodeando un listado de **10 monstruos** dentro del proyecto. El objetivo es ofrecer al usuario información relevante sobre cada monstruo, mostrando un conjunto de características principales que permiten diferenciarlo.

----

## Pantalla principal (Lista de monstruos)

<img width="229" height="513" alt="image" src="https://github.com/user-attachments/assets/f0da63aa-0e3a-49f8-956e-18ff6d31a657" />

En la primera pantalla de la aplicación se muestra, en la parte superior, el **logo de Dungeons & Dragons (DND)**, que estiliza la interfaz.

Debajo del logo se presenta un listado de monstruos utilizando **LazyColumn**, lo que permite una carga eficiente y optimizada de los elementos. Los datos mostrados en esta lista provienen del **ViewModel**.

Cada elemento de la lista se representa mediante una tarjeta que muestra:
- La imagen del monstruo
- El nombre
- El tipo

Esto facilita identificar a cada monstruo.

----

## Pantalla de detalle

<img width="236" height="497" alt="image" src="https://github.com/user-attachments/assets/a4dd3e99-4d7b-4b43-99d6-25c66eb041c8" />


La segunda pantalla corresponde a la **vista de detalle (DetailView)**, donde se muestran todas las características del monstruo seleccionado previamente. Estos datos también están hardcodeados en el **ViewModel**, simulando la información obtenida desde una API externa.

Además, se ha implementado la navegación inversa mediante `popBackStack`, lo que permite que el usuario, al pulsar el icono de la flecha situado en la esquina superior, pueda volver a la pantalla anterior que contiene el listado de monstruos.


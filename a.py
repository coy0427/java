import os
import shutil

# Ruta de tu proyecto
directorio_base = r"D:\College\Programacion_java"
directorio_src = os.path.join(directorio_base, "src")

# Crea la carpeta src principal si no existe
os.makedirs(directorio_src, exist_ok=True)

archivos_movidos = 0

# Recorre todos los archivos en la carpeta raíz
for archivo in os.listdir(directorio_base):
    if archivo.endswith(".java"):
        ruta_archivo = os.path.join(directorio_base, archivo)
        carpeta_destino = directorio_src # Por defecto va a src/ si no tiene paquete
        
        # Lee el archivo buscando la palabra "package"
        try:
            with open(ruta_archivo, 'r', encoding='utf-8') as f:
                for linea in f:
                    linea = linea.strip()
                    if linea.startswith("package ") and linea.endswith(";"):
                        # Extrae el nombre del paquete (ej: "package nuisance;" -> "nuisance")
                        nombre_paquete = linea.replace("package ", "").replace(";", "").strip()
                        # Convierte el punto del paquete en subcarpetas (por si hay "com.ejemplo")
                        ruta_paquete = nombre_paquete.replace(".", os.sep)
                        carpeta_destino = os.path.join(directorio_src, ruta_paquete)
                        break
        except Exception as e:
            print(f"Error leyendo {archivo}: {e}")
        
        # Crea la ruta de carpetas necesaria y mueve el archivo
        os.makedirs(carpeta_destino, exist_ok=True)
        ruta_destino = os.path.join(carpeta_destino, archivo)
        
        shutil.move(ruta_archivo, ruta_destino)
        print(f"Movido: {archivo}  -->  {carpeta_destino}")
        archivos_movidos += 1

print(f"\n¡Éxito! Se organizaron {archivos_movidos} archivos Java dentro de la estructura 'src'.")
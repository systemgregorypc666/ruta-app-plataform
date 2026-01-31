@echo off
title Sistema de Carga System Gregory PC
echo ===========================================
echo   SUBIENDO DATOS DE RUTA-APP A GITHUB
echo ===========================================
echo.

:: 1. Prepara los archivos para la nube
git add .

:: 2. Ponle nombre al guardado con la fecha de hoy
git commit -m "Actualizacion Ruta-App - Proyecto Internacional"

:: 3. Empuja los datos a GitHub
git push origin main

echo.
echo ===========================================
echo   ✅ PROCESO EXITOSO - DATOS GUARDADOS
echo ===========================================
pause

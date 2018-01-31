@REM ----------------------------------------------------------------------------
@REM Fichero batch de CHECK
@REM
@REM Son necesarias las siguientes variables de entorno:
@REM JAVA_HOME - ubicacion del directorio raiz del JDK
@REM
@REM Variables de entorno opcionales:
@REM CHK_HOME - ubicacion del directorio raiz de CheckDeploy
@REM CHK_BATCH_ECHO - establecer a 'on' para habilitar el eco en los comandos batch
@REM CHK_BATCH_PAUSE - establecer a 'on' para habilitar la pausa antes de finalizar el proceso
@REM CHK_TERMINATE_CMD - establecer a 'on' para salir de la linea a de comandos
@REM CHK_OPTS - parametro pasados a la maquina virtual de Java cuando se ejecuta CHECH 
@REM ----------------------------------------------------------------------------

@REM Todas las lineas REM empiezan con el simbolo '@' en caso de que CHK_BATCH_ECHO este habilitado
@echo off
@REM habilita el echo poniendo CHK_BATCH_ECHO to 'on'
@if "%CHK_BATCH_ECHO%" == "on"  echo %CHK_BATCH_ECHO%

@REM establece un %HOME%
if "%HOME%" == "" (set "HOME=%HOMEDRIVE%%HOMEPATH%")

set ERROR_CODE=0

@REM ==== VALIDACION JAVA ====
if not "%JAVA_HOME%" == "" goto OkJHome

echo.
echo ERROR: JAVA_HOME no se ha establecido a un directorio valido.
echo Por favor estableza la variable JAVA_HOME de su entrono para que coincida
echo con la instalación local de Java
echo.
goto error

:OkJHome
if exist "%JAVA_HOME%\bin\java.exe" goto chkMHome

echo.
echo ERROR: JAVA_HOME no se ha establecido a un directorio valido.
echo Por favor estableza la variable JAVA_HOME de su entrono para que coincida
echo con la instalación local de Java
echo.
goto error
goto error

:chkMHome
if not "%CHK_HOME%"=="" goto valMHome

echo.
echo ERROR: CHK_HOME no ha sido encontrado en su entorno.
echo Por favor establezca la variable CHK_HOME de su entorno para que coincida
echo con la instalación local de CHECK
echo.
goto error

:valMHome

:checkMBat
if exist "%CHK_HOME%\bin\check.bat" goto init

echo.
echo ERROR: CHK_HOME se ha establecido a un directorio no valido
echo CHK_HOME = "%CHK_HOME%"
echo Por favor establezca la variable CHK_HOME de su entorno para que coincida
echo con la instalación local de CHECK
echo.
goto error
@REM ==== END VALIDATION ====

:init

set CHK_CMD_LINE_ARGS=%*
goto endInit

:endInit
SET CHK_JAVA_EXE="%JAVA_HOME%\bin\java.exe"

for %%i in ("%CHK_HOME%\lib\*.jar") do set JAR="%%i"
goto runm2

:runm2
set CHK_LAUNCHER=es.iam.check.analisisDespliegues.batch.Main
%CHK_JAVA_EXE% %CHK_OPTS% -classpath %JAR%;%CHK_HOME%\conf; %CHK_LAUNCHER% %CHK_CMD_LINE_ARGS%
if ERRORLEVEL 1 goto error
goto end

:error
@endlocal
set ERROR_CODE=1

:end
@endlocal & set ERROR_CODE=%ERROR_CODE%

if "%CHK_BATCH_PAUSE%" == "on" pause

if "%CHK_TERMINATE_CMD%" == "on" exit %ERROR_CODE%

cmd /C exit /B %ERROR_CODE%
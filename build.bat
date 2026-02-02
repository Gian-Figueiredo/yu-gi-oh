@echo off
setlocal EnableDelayedExpansion

set Mode=%1

:: ======================
:: COMPILE
:: ======================
:compile
if not exist bin mkdir bin

call :clean

set FILES=
for /r src %%f in (*.java) do (
    set FILES=!FILES! "%%f"
)

javac -d bin !FILES!
exit /b

:: ======================
:: RUN
:: ======================
:run
java -cp bin %2
exit /b

:: ======================
:: TEST
:: ======================
:test
set Name=%2

for /r bin %%f in (*%Name%.class) do (
    set Arquivo=%%f
)

:: remove "bin\"
set Arq=!Arquivo:bin\=!

:: troca "\" por "."
set A=!Arq:\=.!

:: remove .class
set A=!A:.class=!

call :run %A%
exit /b

:: ======================
:: CLEAN
:: ======================
:clean
if exist bin (
    rmdir /s /q bin
)
exit /b

:: ======================
:: MAIN
:: ======================
if "%Mode%"=="compile" (
    call :compile

) else if "%Mode%"=="run" (
    call :compile
    call :run Main

) else if "%Mode%"=="clean" (
    call :clean

) else if "%Mode%"=="test" (
    if "%2"=="" (
        echo Para usar o comando test, voce precisa passar o nome da classe.
        echo Exemplo: build.bat test Espada
    ) else (
        call :compile
        call :test %2
    )

) else (
    echo Uso: build.bat ^<compile^|run^|test^|clean^>
    echo.
    echo Comandos disponiveis:
    echo   compile   Compila o codigo-fonte
    echo   run       Executa o programa
    echo   test      Executa uma classe especifica
    echo   clean     Remove os arquivos gerados (bin)
)

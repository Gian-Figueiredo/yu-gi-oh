Mode=$1

compile () {
    mkdir -m bin
    javac -d bin $(find src -name *.java)
}

run () {
    java -cp bin "$1"
}

test () {
    local Name="$1"
    Arquivo=$(find bin -name "*${Name}.class")
    Arq=${Arquivo#*/}
    A=${Arq//\//.}
    run "${A%.*}"
}

if [ "$Mode" = "compile" ]; then
    compile

elif [ "$Mode" = "run" ]; then
    compile
    run Main

elif [ "$Mode" = clean ]; then
    rm -rf bin/*

elif [ "$Mode" = test ]; then
    if [ -z "$2" ]; then
        echo "  para usar o comando test, você precisa passar mais um argumento, que seria o nome do arquivo a ser testado"
        echo "  E.g.: ./build.sh test Espada --> Roda o método main do arquivo Espada.java"
    else
        compile
        test "$2"
    fi

else
    echo "Uso: ./build.sh {compile|run|test|clean}"
    echo
    echo "Comandos disponíveis:"
    echo "  compile   Compila o código-fonte"
    echo "  run       Executa o programa"
    echo "  clean     Remove os arquivos gerados (bin)"
    echo "  test      Executa testes em um arquivo específico"
    echo
    echo "Observação"
    echo "  para usar o comando test, você precisa passar mais um argumento, que seria o nome do arquivo a ser testado"
    echo "E.g.: ./build.sh test Espada --> Roda o método main do arquivo Espada.java"
fi
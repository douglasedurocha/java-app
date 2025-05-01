# Java App

Aplicação Java simples que exibe a versão em uma interface gráfica.

## Versões

- **1.0.0**: Requer JDK 11, uma dependência simples
- **1.2.0**: Requer JDK 17, uma dependência simples
- **2.0.0**: Requer JDK 21, duas dependências simples

## Compilação

Para compilar o projeto:

```bash
mvn clean package
```

## Execução

Para executar manualmente:

```bash
java -jar target/java-app-1.0.0.jar
```

## FG CLI

Este projeto é gerenciado pelo CLI `fg`, que facilita a instalação e execução de diferentes versões:

- `fg list` - Lista versões disponíveis
- `fg install <versão>` - Instala uma versão específica
- `fg update` - Instala a última versão disponível
- `fg status` - Verifica o status da aplicação
- `fg logs [pid]` - Visualiza logs
- `fg stop [pid]` - Para a aplicação em execução
- `fg uninstall <versão>` - Desinstala uma versão
- `fg start` - Inicia a aplicação
- `fg gui` - Inicia a interface gráfica 
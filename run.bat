rm *.interp
rm SimpleCode.tokens
rm SimpleCodeLexer*
rm SimpleCodeListener.py
rm SimpleCodeParser.py
java -Xmx500M -cp antlr-4.7.2-complete.jar org.antlr.v4.Tool -Dlanguage=Python3 SimpleCode.g4
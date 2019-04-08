rm *.interp
rm BaiTap1.tokens
rm BaiTap1Lexer*
rm BaiTap1Listener.py
rm BaiTap1Parser.py
java -Xmx500M -cp antlr-4.7.2-complete.jar org.antlr.v4.Tool -Dlanguage=Python3 BaiTap1.g4
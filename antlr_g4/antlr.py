import sys
from antlr4 import *
from SqlBaseLexer import SqlBaseLexer
from SqlBaseParser import SqlBaseParser
# from VisitorInterp import VisitorInterp

def main(argv):
    input_stream = FileStream("../data/test.hql")
    
    lexer = SqlBaseLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = SqlBaseParser(tokens)
    print(parser.query())

if __name__ == '__main__':
    main(sys.argv)
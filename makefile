SRC = Main.java
OBJ = Main

all: compile run

compile:
	javac $(SRC)

run:
	java $(OBJ)
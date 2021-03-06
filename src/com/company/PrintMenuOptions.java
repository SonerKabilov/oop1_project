package com.company;

public class PrintMenuOptions {

    public void help() {
        System.out.println("\nThe following commands are supported:");
        System.out.println("open <filename>\t\t/opens <filename>/");
        System.out.println("save \t\t/saves the currently open file/");
        System.out.println("saveas \t\t/saves the currently open file in <filepath>/");
        System.out.println("close\t\t/closes currently opened file/");
        System.out.println("import <filename>\t\t/imports <filename> to the database/");
        System.out.println("showtables\t\t/shows all tables in the database/");
        System.out.println("insert <filename>\t\t/inserts a new node to <filename>/");
        System.out.println("describe <filename>\t\t/prints information about <filename> columns and data types/");
        System.out.println("print <filename>\t\t/prints <filename> nodes/");
        System.out.println("delete <table name> <search column> <search value>\t\t/deletes a node in <tablename> by given <search column> and <search value>/");
        System.out.println("update <table name> <search column> <search value> <target value>\t\t/updates all <search column> in <table name>");
        System.out.println("select <table name> <search column> <search value>\t\t/selects all nodes in <tablename> by given <search column> and <search value>/");
        System.out.println("count <table name> <search column> <search value>\t\t/counts all nodes in <tablename> by given <search column> and <search value>/");
        System.out.println("addcolumn <table name> <column name> <column type>\t\t/adds a new column in all existing nodes/");
        System.out.println("rename <old name> <new name>\t\t/renames the file <old name> with the <new name>/");
        System.out.println("help\t\t/prints this information/");
        System.out.println("exit\t\t/exits the program");
    }
}

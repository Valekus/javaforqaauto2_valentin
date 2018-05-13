public class Main {
    public static void main(String[] args) {

        MyCustomFileParserInterface myP = null;
        if (args[0].equals("JSON")){
            myP = new JSONFileParser();

        }else if(args[0].equals("XML")){
            myP = new XMLFileParser();
        }
        myP.addWord("New word");
        myP.findWord("New");

    }
}

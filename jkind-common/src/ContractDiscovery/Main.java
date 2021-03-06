package ContractDiscovery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import jkind.lustre.Program;
import jkind.lustre.parsing.LustreParseUtil;
public class Main {

    static String folderName = "/Users/sohahussein/git/jkind/testing/discovery-examples/";
    static String tFileNameOld = folderName + "NoRepairLibrary.lus";
    static String rFileName = folderName + "SimplePadReset.runPadSteps(IZZZZZ)V#27_0.txt";


    public static void main(String[] args) throws DiscoveryException, IOException {

        String programStrOld = null;

        try {
            programStrOld = new String(Files.readAllBytes(Paths.get(tFileNameOld)), "UTF-8");

        } catch (IOException e) {
            System.out.println("Problem reading file. " + e.getMessage());
        }

        Program oldprogram = LustreParseUtil.program(programStrOld);



        System.out.println("here is the old program read\n" + oldprogram.toString());

        //System.out.println("classpath is:" + System.getProperty("java.class.path"));


    }
}

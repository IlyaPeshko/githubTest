package by.htp.git.utility.Pairwise;

import by.htp.git.utility.Pairwise.entitty.Node;
import by.htp.git.utility.Pairwise.entitty.Pair;
import by.htp.git.utility.Permanent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private Pair pair;
    private List<Pair> list;

    private static final String delimiter = ";";

    public ArrayList<Pair> fetchPair (){

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = delimiter;
        list = new ArrayList<>();

        try {

            br = new BufferedReader(new FileReader(Permanent.PICT_DOCUMENT_PATH));

            while ((line = br.readLine()) != null) {
                pair = new Pair();
                String[] nodeS = line.split(cvsSplitBy);

                pair.setPair_1(new Node(nodeS[0]));
                pair.setPair_2(new Node(nodeS[1]));
                pair.setPair_3(new Node(nodeS[2]));

                list.add(pair);

            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("br not close");
                }
            }
        }
        return (ArrayList<Pair>) list;
    }
}
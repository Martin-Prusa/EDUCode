package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ukol1 {

    private static String text = "assam. enodc erolm utetcesnocr at iuds uiravs utciDm ca. enodc ores evl iuqs inicala utnemidnocm otroTr rotcua. epmesr arcs a illavnocs uqene divarGa tema. ist eget euqilat rreviva esm Ut te. enodc ilefs ac auqesnoct eu ugnoce atiVe sillavnoc. rterahpa aneceams atseges ipruts ac emaFs ropmet. iduticillosn aidm a elo otittroPr saneceam. rreviva dommoco usirs evl nunc dauselaMa isin. onn allunm eget nudicnitt sinl ubicuafs id rebilo utetcesnoCr rolod. uspim erolm reusope udretnim ubicuaFs suten. et utceness uqitsirte bromi natibaht uqsetnellepe ilEt subicuaf. nunc inem bromi uiravs uqsirelecse aigueft egetnIr niduticillos. uqitsirte iuds ilet nicsipidag utetcesnocr emat ist olodr uspIm ibrom. eprocmallur esd ilevt eprocmallur ittaMs rotcua. ative ecirtlus eu uqsirelecse sini siNl alugil. et eipasn anivlupr nunc nudicnitt ssama eidrepmit iuqs dommoCo di. auqilam emat ist rterahpa ut tatupluve aidm inem enoDc cnun. itselome ullets binh utnemelem itrobols eu croi opmeTr essidnepsus. rreviva uiterpm otrotr ut ilevt Id auqila. ngama rolode et robale ut nudidicnit opmetr omsuied do esd tile, nicsipidag utetcesnocr tema, ist olodr uspim eroLm";

    public static void main(String[] args) {
        String opacnyText = "";
        for (int i = text.length()-1; i >= 0; i--) {
            opacnyText+=text.charAt(i);
        }
        String[] a = opacnyText.split(" ");
        System.out.println(Arrays.toString(a));
        String f = "";
        for (String s : a) {

            f += s.substring(1)+s.charAt(0)+" ";
        }

        zapis(f);
    }

    private static void zapis(String s) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ukol1.txt"));
            bw.write(s);
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

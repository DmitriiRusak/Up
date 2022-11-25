package some_classes.Sring;
//zapydrili mozgi vot etim ysloviem:

//Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid
// bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
//
//Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains
// no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
//
//Create a function which translates a given DNA string into RNA.
//
//For example:
//"GCAT"  =>  "GCAU"
//The input string can be of arbitrary length - in particular, it may be empty. All input is guaranteed to be valid, i.e. each input
// string will only ever consist of 'G', 'C', 'A' and/or 'T'.

//po facty priletaet string, v nei nado pomeniat tolko 'T' na 'U'. i metod iz String, replace() idealno podxodit, i ne nado nikakix
//massivov i pereborov s proverkami v ciklax. Prosto v pervom parametre ykazal chto meniaem, vo vtorom parametre ykazal na chto meniaem.
public class Metod_Replace {

    public String dnaToRna(String dna) {

        char arrayTemp[]=dna.toCharArray();
        dna="";
        for(int i=0;i<arrayTemp.length ;i++){
            dna+=arrayTemp[i]=='T'? 'U' : arrayTemp[i];
        }
        return dna;
        //        return dna.replace("T", "U");   pizdec vot eto reshenie
    }
}

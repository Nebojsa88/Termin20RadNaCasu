package com.ftninformatika.termin20radnacasu.providers;

import com.ftninformatika.termin20radnacasu.model.Glumac;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GlumacProvider {

    public static List<Glumac> getGlumci(){

        List<Glumac> glumci = new ArrayList<>();

        glumci.add(new Glumac(0, "Marko", "Markovic", "Mesto za biografiju", "Zvezde", "glumac.jpg",  4.3f, new Date()));
        glumci.add(new Glumac(0, "Nemanja", "Markovic", "Mesto za biografiju", "Zvezde2", "glumac1.jpg",  3.5f, new Date()));
        glumci.add(new Glumac(0, "Stefan", "Markovic", "Mesto za biografiju", "Zvezde3", "glumac2.jpg",  2.5f, new Date()));
        return glumci;

    }
    public static List<String> getGlumciNames(){
        List<String>names = new ArrayList<>();
        names.add("Marko");
        names.add("Nemanja");
        names.add("Stefan");
        return names;
    }
    public static Glumac getGlumacById(int id){

        switch (id){
            case 0:
                return new Glumac(0, "Marko", "Markovic", "Mesto za biografiju", "Zvezde", "glumac.jpg",  4.3f, new Date());
            case 1:
                return new Glumac(0, "Nemanja", "Markovic", "Mesto za biografiju", "Zvezde2", "glumac1.jpg",  3.5f, new Date());
            case 2:
                return new Glumac(0, "Stefan", "Markovic", "Mesto za biografiju", "Zvezde3", "glumac2.jpg",  2.5f, new Date());
            default:
                return null;

        }
    }


}

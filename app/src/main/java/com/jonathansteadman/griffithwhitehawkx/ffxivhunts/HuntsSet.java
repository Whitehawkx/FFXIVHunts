
package com.jonathansteadman.griffithwhitehawkx.ffxivhunts;

import java.util.ArrayList;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class HuntsSet {
    private static HuntsSet huntsSet;

    private ArrayList<Hunts> hunts = new ArrayList<Hunts>();

    private HuntsSet() {
        hunts.add(new Hunts(R.drawable.vogaal_ja, "Vogaal Ja", "Middle La Noscea", 4));
        hunts.add(new Hunts(R.drawable.croque_mitaine, "Croque-Mitaine", "Middle La Noscea", 72));
        hunts.add(new Hunts(R.drawable.hellsclaw, "Hellsclaw", "Eastern La Noscea", 4));
        hunts.add(new Hunts(R.drawable.garlok, "Garlok", "Eastern La Noscea", 72));
        hunts.add(new Hunts(R.drawable.unktehi, "Unktehi", "Lower La Noscea", 4));
        hunts.add(new Hunts(R.drawable.croakadile, "Croakadile", "Lower La Noscea", 72));
        hunts.add(new Hunts(R.drawable.vogaal_ja, "Vogaal Ja", "Middle La Noscea", 4));
        hunts.add(new Hunts(R.drawable.croque_mitaine, "Croque-Mitaine", "Middle La Noscea", 72));
        hunts.add(new Hunts(R.drawable.hellsclaw, "Hellsclaw", "Eastern La Noscea", 4));
        hunts.add(new Hunts(R.drawable.garlok, "Garlok", "Eastern La Noscea", 72));
        hunts.add(new Hunts(R.drawable.unktehi, "Unktehi", "Lower La Noscea", 4));
        hunts.add(new Hunts(R.drawable.croakadile, "Croakadile", "Lower La Noscea", 72));
    }

    public static HuntsSet getInstance() {
        if (huntsSet == null) {
            huntsSet = new HuntsSet();
        }
        return huntsSet;
    }

    public ArrayList<Hunts> getHunts() {
        return hunts;
    }

    public Hunts getHunts(int id) {
        if (id >= hunts.size()) {
            return null;
        }
        return hunts.get(id);
    }
    
    public ArrayList<Hunts> getEastern() {
        ArrayList<Hunts> filteredList = Lists.newArrayList(Collections2.filter(hunts,
                new HuntsFilter("Eastern")));
        return filteredList;
    }

}

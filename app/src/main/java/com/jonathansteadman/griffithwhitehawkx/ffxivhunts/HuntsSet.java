
package com.jonathansteadman.griffithwhitehawkx.ffxivhunts;

import java.util.ArrayList;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class HuntsSet {
    private static HuntsSet huntsSet;

    private ArrayList<Hunts> hunts = new ArrayList<Hunts>();

    private HuntsSet() {
        //Noscea mobs
        hunts.add(new Hunts(R.drawable.vogaal_ja, "Vogaal Ja", "Middle La Noscea", 4));
        hunts.add(new Hunts(R.drawable.croque_mitaine, "Croque-Mitaine", "Middle La Noscea", 72));
        hunts.add(new Hunts(R.drawable.unktehi, "Unktehi", "Lower La Noscea", 4));
        hunts.add(new Hunts(R.drawable.croakadile, "Croakadile", "Lower La Noscea", 72));
        hunts.add(new Hunts(R.drawable.hellsclaw, "Hellsclaw", "Eastern La Noscea", 4));
        hunts.add(new Hunts(R.drawable.garlok, "Garlok", "Eastern La Noscea", 72));
        hunts.add(new Hunts(R.drawable.nuhn, "Nuhn", "Western La Noscea", 4));
        hunts.add(new Hunts(R.drawable.bonnacon, "Bonnacon", "Western La Noscea", 72));
        hunts.add(new Hunts(R.drawable.marberry, "Marberry", "Upper La Noscea", 4));
        hunts.add(new Hunts(R.drawable.nandi, "Nandi", "Upper La Noscea", 72));
        hunts.add(new Hunts(R.drawable.cornu, "Cornu", "Outer La Noscea", 4));
        hunts.add(new Hunts(R.drawable.mahisha, "Mahisha", "Outer La Noscea", 72));
        //Shroud mobs
        hunts.add(new Hunts(R.drawable.forneus, "Forneus", "Central Shroud", 4));
        hunts.add(new Hunts(R.drawable.laideronnette, "Laideronnette", "Central Shroud", 72));
        hunts.add(new Hunts(R.drawable.melt, "Melt", "East Shroud", 4));
        hunts.add(new Hunts(R.drawable.wulgaru, "Wulgaru", "East Shroud", 72));
        hunts.add(new Hunts(R.drawable.ghedetimalice, "Ghede Ti Malice", "South Shroud", 4));
        hunts.add(new Hunts(R.drawable.mindflayer, "Mindflayer", "South Shroud", 72));
        hunts.add(new Hunts(R.drawable.girtab, "Girtab", "North Shroud", 4));
        hunts.add(new Hunts(R.drawable.thousandcast_theda, "Thousand-Cast Theda", "North Shroud", 72));
        //Thanalan mobs
        hunts.add(new Hunts(R.drawable.alectryon, "Alectryon", "Western Thanalan", 4));
        hunts.add(new Hunts(R.drawable.zona_seeker, "Zona Seeker", "Western Thanalan", 72));
        hunts.add(new Hunts(R.drawable.sabotender_bailarina, "Sabotender Bailarina", "Central Thanalan", 4));
        hunts.add(new Hunts(R.drawable.brontes, "Brontes", "Central Thanalan", 72));
        hunts.add(new Hunts(R.drawable.maahes, "Maahes", "Eastern Thanalan", 4));
        hunts.add(new Hunts(R.drawable.lampalagua, "Lampalagua", "Eastern Thanalan", 72));
        hunts.add(new Hunts(R.drawable.zanigoh, "Zanig'oh", "Southern Thanalan", 4));
        hunts.add(new Hunts(R.drawable.nunyunuwi, "Nunyunuwi", "Southern Thanalan", 72));
        hunts.add(new Hunts(R.drawable.dalvags_final_flame, "Dalvag's Final Flame", "Northern Thanalan", 4));
        hunts.add(new Hunts(R.drawable.minhocao, "Minhocao", "Northern Thanalan", 72));
        //Coerthas mobs
        hunts.add(new Hunts(R.drawable.marraco, "Marraco", "Coerthas", 4));
        hunts.add(new Hunts(R.drawable.safat, "Safat", "Coerthas", 72));
        //Mor Dhona mobs
        hunts.add(new Hunts(R.drawable.kurrea, "Kurrea", "Mor Dhona", 4));
        hunts.add(new Hunts(R.drawable.agrippa, "Agrippa", "Mor Dhona", 72));
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

    public ArrayList<Hunts> getNoscea() {
        ArrayList<Hunts> filteredList = Lists.newArrayList(Collections2.filter(hunts,
                new HuntsFilter("Noscea")));
        return filteredList;
    }

    public ArrayList<Hunts> getShroud() {
        ArrayList<Hunts> filteredList = Lists.newArrayList(Collections2.filter(hunts,
                new HuntsFilter("Shroud")));
        return filteredList;
    }

    public ArrayList<Hunts> getThanalan() {
        ArrayList<Hunts> filteredList = Lists.newArrayList(Collections2.filter(hunts,
                new HuntsFilter("Thanalan")));
        return filteredList;
    }

    public ArrayList<Hunts> getCoerthas() {
        ArrayList<Hunts> filteredList = Lists.newArrayList(Collections2.filter(hunts,
                new HuntsFilter("Coerthas")));
        return filteredList;
    }

    public ArrayList<Hunts> getDhona() {
        ArrayList<Hunts> filteredList = Lists.newArrayList(Collections2.filter(hunts,
                new HuntsFilter("Dhona")));
        return filteredList;
    }

}

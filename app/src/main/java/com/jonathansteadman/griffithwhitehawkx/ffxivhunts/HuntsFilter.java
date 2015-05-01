package com.jonathansteadman.griffithwhitehawkx.ffxivhunts;

import java.util.regex.Pattern;

import com.google.common.base.Predicate;

public final class HuntsFilter implements Predicate<Hunts> {

    private final Pattern pattern;

    public HuntsFilter(final String regex)
    {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean apply(final Hunts input)
    {
        return pattern.matcher(input.getZone()).find();
    }

}

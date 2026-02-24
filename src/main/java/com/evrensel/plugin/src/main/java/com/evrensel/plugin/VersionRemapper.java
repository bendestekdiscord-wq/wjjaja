package com.evrensel.plugin;

import java.util.HashMap;
import java.util.Map;

public class VersionRemapper {
    private final Map<String, String> mappings = new HashMap<>();

    public VersionRemapper() {
        mappings.put("v1_17_R1", "v1_21_R1");
        mappings.put("v1_18_R1", "v1_21_R1");
        mappings.put("v1_19_R1", "v1_21_R1");
        mappings.put("v1_20_R1", "v1_21_R1");
    }

    public String remapClassName(String name) {
        for (Map.Entry<String, String> entry : mappings.entrySet()) {
            if (name.contains(entry.getKey())) {
                return name.replace(entry.getKey(), entry.getValue());
            }
        }
        return name;
    }
}

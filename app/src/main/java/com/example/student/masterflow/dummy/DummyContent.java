package com.example.student.masterflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 3;

    static {

            addItem(new DummyItem("1","lms","http://lms.bml.edu.in/","open lms"));
        addItem(new DummyItem("2","website","http://www.bml.edu.in/","open website"));
        addItem(new DummyItem("3","FACEBOOK","https://www.facebook.com/","open facebook"));
    }
//entering data into list
    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static class DummyItem {
        public final String id;
        public final String itemname;
        public final String url;
        public final String details;

        public DummyItem(String id, String itemname,String url, String details) {
            this.id = id;
            this.itemname = itemname;
            this.url=url;
            this.details = details;
        }


        @Override
        public String toString() {
            return itemname;
        }
    }
}

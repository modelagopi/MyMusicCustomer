package com.example.mymusic.repository;

import com.example.mymusic.object.DirectoryHome7Category;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * Created by Panacea-Soft on 14/6/18.
 * Contact Email : teamps.is.cool@gmail.com
 * Website : http://www.panacea-soft.com
 */
public class DirectoryHome7Repository {

    public static ArrayList<DirectoryHome7Category> getCategoryList() {
        return new Gson().fromJson(json, new TypeToken<ArrayList<DirectoryHome7Category>>() {
        }.getType());
    }

    private static String json = "[\n" +
            "  {\n" +
            "    \"name\" : \"Album\",\n" +
            "    \"image\" : \"mymusic_app_icon\",\n" +
            "    \"color\" : \"#c42e2e\"\n" +
            "  },\n" +

            "  {\n" +
            "    \"name\" : \"Regalia\",\n" +
            "    \"image\" : \"calendar\",\n" +
            "    \"color\" : \"#466fd5\"\n" +
            "  },\n" +

            "  {\n" +
            "    \"name\" : \"Awards\",\n" +
            "    \"image\" : \"winner\",\n" +
            "    \"color\" : \"#b50b5c\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\" : \"Sold Items\",\n" +
            "    \"image\" : \"shopping_bagg\",\n" +
            "    \"color\" : \"#7800a5\"\n" +
            "  },\n" +

            "  {\n" +
            "    \"name\" : \"Upcomming Evenst\",\n" +
            "    \"image\" : \"calender\",\n" +
            "    \"color\" : \"#4683d4\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\" : \"Profile\",\n" +
            "    \"image\" : \"profile_icon\",\n" +
            "    \"color\" : \"#3e35a2\"\n" +
            "  }\n," +
            "  {\n" +
            "    \"name\" : \"Follows\",\n" +
            "    \"image\" : \"viewers\",\n" +
            "    \"color\" : \"#4683d4\"\n" +
            "  }\n," +
            "  {\n" +
            "    \"name\" : \"Chat\",\n" +
            "    \"image\" : \"baseline_chatbubble_orange_24\",\n" +
            "    \"color\" : \"#3e35a2\"\n" +
            "  }\n" +




            "]";

}

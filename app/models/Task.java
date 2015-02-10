package models;

import play.data.validation.Constraints.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by samuel on 10.02.15..
 */
public class Task {
    public Long id;

    @Required
    public String label;

    public static List<Task> all() {
        return new ArrayList<Task>();
    }

    public static void create(Task task){

    }
    public static void delete(Long id){

    }
}

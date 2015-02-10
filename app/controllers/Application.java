package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import models.Task;

public class Application extends Controller {

    // this is for validation constraints
    static Form<Task> taskForm = Form.form(Task.class);

    public static Result index() {
        return redirect(routes.Application.tasks());
    }

    public static Result tasks() {
        return ok(index.render(Task.all(), taskForm));
    }

    public static Result newTask() {
        return TODO;
    }

    public static Result deleteTask(Long id) {
        return TODO;
    }

}

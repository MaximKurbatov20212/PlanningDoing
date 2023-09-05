package nsu.maxwell.controller;

import nsu.maxwell.enity.DoneNote;
import nsu.maxwell.enity.ExecutionNote;
import nsu.maxwell.enity.TrashNote;
import nsu.maxwell.service.DoneNoteService;
import nsu.maxwell.service.ExecutionNoteService;
import nsu.maxwell.service.TrashNoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/move")
public class MigrationController {
    private final TrashNoteService trashNoteService;
    private final ExecutionNoteService executionNoteService;
    private final DoneNoteService doneNoteService;

    public MigrationController(TrashNoteService trashNoteService, ExecutionNoteService executionNoteService, DoneNoteService doneNoteService) {
        this.trashNoteService = trashNoteService;
        this.executionNoteService = executionNoteService;
        this.doneNoteService = doneNoteService;
    }

    @GetMapping("/toTrash")
    public String toTrash(@RequestParam("id") long id, @RequestParam("name") String name,
                          @RequestParam("anons") String anons, @RequestParam("fullText") String fullText,
                          @RequestParam("deadline") String deadline) {

        if (executionNoteService.getById(id).isPresent()) {
            trashNoteService.add(new TrashNote(name, anons, fullText, NoteController.getNewDate(deadline.substring(0, 10), executionNoteService.getById(id).get())));
            executionNoteService.delete(id);
        } else if (doneNoteService.getById(id).isPresent()) {
            trashNoteService.add(new TrashNote(name, anons, fullText, NoteController.getNewDate(deadline.substring(0, 10), doneNoteService.getById(id).get())));
            doneNoteService.delete(id);

        }
        return "redirect:/";
    }

    @GetMapping("/toExecution")
    public String toExecution(@RequestParam("id") long id, @RequestParam("name") String name,
                              @RequestParam("anons") String anons, @RequestParam("fullText") String fullText,
                              @RequestParam("deadline") String deadline) {

        if (trashNoteService.getById(id).isPresent()) {
            executionNoteService.add(new ExecutionNote(name, anons, fullText, NoteController.getNewDate(deadline.substring(0, 10), trashNoteService.getById(id).get())));
            trashNoteService.delete(id);
        } else if (doneNoteService.getById(id).isPresent()) {
            executionNoteService.add(new ExecutionNote(name, anons, fullText, NoteController.getNewDate(deadline.substring(0, 10), doneNoteService.getById(id).get())));
            doneNoteService.delete(id);

        }
        return "redirect:/";
    }

    @GetMapping("/toDone")
    public String toDone(@RequestParam("id") long id, @RequestParam("name") String name,
                         @RequestParam("anons") String anons, @RequestParam("fullText") String fullText,
                         @RequestParam("deadline") String deadline) {

        if (trashNoteService.getById(id).isPresent()) {
            doneNoteService.add(new DoneNote(name, anons, fullText, NoteController.getNewDate(deadline.substring(0, 10), trashNoteService.getById(id).get())));
            trashNoteService.delete(id);
        } else if (executionNoteService.getById(id).isPresent()) {
            doneNoteService.add(new DoneNote(name, anons, fullText, NoteController.getNewDate(deadline.substring(0, 10), executionNoteService.getById(id).get())));
            executionNoteService.delete(id);

        }
        return "redirect:/";
    }
}
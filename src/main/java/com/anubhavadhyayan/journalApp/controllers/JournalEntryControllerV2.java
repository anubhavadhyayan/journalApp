package com.anubhavadhyayan.journalApp.controllers;

import com.anubhavadhyayan.journalApp.entity.JournalEntry;
import com.anubhavadhyayan.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/new_journal")
public class JournalEntryControllerV2 {


    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getEntryDetailById(@PathVariable String myId){
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryDetailById(@PathVariable String myId){
        return null;
    }

    @PutMapping("id/{myId}")
    public JournalEntry updateEntryDetailById(@PathVariable String myId, @RequestBody JournalEntry journalEntry){
        return null;
    }
}

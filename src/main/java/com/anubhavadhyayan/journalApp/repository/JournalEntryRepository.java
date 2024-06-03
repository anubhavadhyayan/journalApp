package com.anubhavadhyayan.journalApp.repository;

import com.anubhavadhyayan.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {
}

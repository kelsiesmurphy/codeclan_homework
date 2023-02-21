package com.codeclan.files_and_folders.components;

import com.codeclan.files_and_folders.models.File;
import com.codeclan.files_and_folders.models.Folder;
import com.codeclan.files_and_folders.models.Person;
import com.codeclan.files_and_folders.repositories.FileRepository;
import com.codeclan.files_and_folders.repositories.FolderRepository;
import com.codeclan.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private FolderRepository folderRepository;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person johnWayne = new Person("John Wayne");
        personRepository.save(johnWayne);

        Person bruceWillis = new Person("Bruce Willis");
        personRepository.save(bruceWillis);

        Person marthaDyke = new Person("Martha Dyke");
        personRepository.save(marthaDyke);


        Folder folderConfidential = new Folder("Confidential", bruceWillis);
        folderRepository.save(folderConfidential);

        Folder folderPublic = new Folder("Public", johnWayne);
        folderRepository.save(folderPublic);

        Folder folderPrivate = new Folder("Private", marthaDyke);
        folderRepository.save(folderPrivate);


        File file1 = new File("10 Disney Songs", "txt", 11.2, folderPublic);
        fileRepository.save(file1);

        File file2 = new File("Top secret codes", "ppt", 71.3, folderConfidential);
        fileRepository.save(file2);

        File file3 = new File("Singing interview", "mp4", 131.2, folderPrivate);
        fileRepository.save(file3);



        johnWayne.addFolder(folderConfidential);
        johnWayne.addFolder(folderPrivate);
        personRepository.save(johnWayne);

        marthaDyke.addFolder(folderPrivate);
        marthaDyke.addFolder(folderPublic);
        personRepository.save(marthaDyke);

        bruceWillis.addFolder(folderConfidential);
        bruceWillis.addFolder(folderPublic);
        personRepository.save(bruceWillis);



        folderPublic.addFile(file1);
        folderPublic.addFile(file3);
        folderRepository.save(folderPublic);

        folderConfidential.addFile(file2);
        folderPublic.addFile(file3);
        folderRepository.save(folderConfidential);

        folderPrivate.addFile(file2);
        folderPublic.addFile(file1);
        folderRepository.save(folderPrivate);
    }
}

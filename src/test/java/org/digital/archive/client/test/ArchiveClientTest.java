package org.digital.archive.client.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.digital.archive.Application;
import org.digital.archive.client.ArchiveServiceClient;
import org.digital.archive.dao.FileSystemDocumentDao;
import org.digital.archive.service.Document;
import org.digital.archive.service.DocumentMetadata;
import org.digital.archive.service.IArchiveService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
//@IntegrationTest
public class ArchiveClientTest {

    private static final Logger LOG = Logger.getLogger(ArchiveClientTest.class);
    
    private static final String TEST_FILE_DIR = "test-images";

    ApplicationContext applicationContext;
    IArchiveService client;

    @Before
    public void setUp() throws IOException {
        client = new ArchiveServiceClient();
     //   testUpload();
    }

    @After
    public void tearDown() {
      //  deleteDirectory(new File(FileSystemDocumentDao.DIRECTORY));
    }

   
}

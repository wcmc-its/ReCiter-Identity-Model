package reciter.model.identity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@DynamoDBDocument
@Builder
@Data
public class Identity {

    private String uid; // uid of the user
    private AuthorName primaryName; // primary name of the user
    private List<AuthorName> alternateNames; // aliases
    private List<String> emails; // list of emails
    private List<KnownRelationship> knownRelationships; // known relationships
    private List<String> departments; // list of department
    private String title; // title of the person
    private List<String> institutions; // institutions
    private Education degreeYear; // degreeYear
    private List<String> personTypes; // type of person: i.e., academic, academic-faculty, etc...
    private String program; // program the person is in.
    private List<String> boardCertifications; // board certifications
    private String citizenship; // citizenship
    private List<String> grants; // grants
    private List<String> keywords; // keywords
    private List<PubMedAlias> pubMedAlias; // name alias from PubMed
    private LocalDateTime dateInitialRun; // the date of the first time that ReCiter perform the retrieval
    private LocalDateTime dateLastRun; // the date of the most recent retrieval
}

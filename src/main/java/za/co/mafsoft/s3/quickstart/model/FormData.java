package za.co.mafsoft.s3.quickstart.model;

import java.io.File;

import jakarta.ws.rs.core.MediaType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jboss.resteasy.reactive.PartType;
import org.jboss.resteasy.reactive.RestForm;

@Data
@NoArgsConstructor
public class FormData {
    @RestForm("file")
    private File data;
    @RestForm
    @PartType(MediaType.TEXT_PLAIN)
    private String fileName;
    @RestForm
    @PartType(MediaType.TEXT_PLAIN)
    private String mimeType;
}

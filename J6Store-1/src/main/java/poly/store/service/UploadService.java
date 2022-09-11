package poly.store.service;

import java.io.File;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface UploadService {

	File save(MultipartFile file, String folder);
	
}

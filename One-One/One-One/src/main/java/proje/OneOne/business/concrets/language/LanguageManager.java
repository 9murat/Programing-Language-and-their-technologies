package proje.OneOne.business.concrets.language;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proje.OneOne.business.abstracts.languages.ILanguageService;
import proje.OneOne.business.request.language.DeleteLanguageRequest;
import proje.OneOne.business.response.language.GetAllLanguageResponse;
import proje.OneOne.business.response.language.GetByIdLanguageResponse;
import proje.OneOne.core.utilities.Results.*;
import proje.OneOne.core.utilities.mappers.IModelMapperservice;
import proje.OneOne.dataAccess.ILanguageDao;
import proje.OneOne.entities.Language;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class LanguageManager implements ILanguageService {

    private final ILanguageDao iLanguageDao;
    private final IModelMapperservice iModelMapperservice;

    public LanguageManager(ILanguageDao iLanguageDao, IModelMapperservice iModelMapperservice) {
        this.iLanguageDao = iLanguageDao;
        this.iModelMapperservice = iModelMapperservice;
    }

    @Override
    public Result delete(int id) {

        if (iLanguageDao.existsById(id)){
            this.iLanguageDao.deleteById(id);
            return new SuccesResult(true,id +" li Languages başarıyla silindi");
        }

        return new ErrorResult(false,"Kullanıcı bulunamadı");
    }

    @Override
    public DataResult<List<GetAllLanguageResponse>> getAll() {
        List<Language> languages = iLanguageDao.findAll();
        List<GetAllLanguageResponse> getAllLanguageResponses = languages.stream().map(language -> this.iModelMapperservice.forResponse().map(language, GetAllLanguageResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<Language>>(this.iLanguageDao.findAll(),"Languages Başarıyşla eklendi");
    }

    @Override
    public Result add(int id) {
    if (iLanguageDao.existsById(id)){
        this.iLanguageDao.findById(id);
       return   new SuccesResult(true,id +" li language ekledni Eklendi");
    }
   return new ErrorResult(false,"Başarısız ekleme");
    }


}

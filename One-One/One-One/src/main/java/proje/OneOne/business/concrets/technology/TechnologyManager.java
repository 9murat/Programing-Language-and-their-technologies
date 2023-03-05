package proje.OneOne.business.concrets.technology;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import proje.OneOne.business.abstracts.technology.ITechnologyService;
import proje.OneOne.business.request.technology.CreateTechnologyRequest;
import proje.OneOne.business.request.technology.UpdateTechnologyRequest;
import proje.OneOne.business.response.technology.GetAllTechnologyResponse;
import proje.OneOne.business.response.technology.GetByIdTechnologyResponse;
import proje.OneOne.core.utilities.Results.*;
import proje.OneOne.core.utilities.mappers.IModelMapperservice;
import proje.OneOne.dataAccess.ILanguageDao;
import proje.OneOne.dataAccess.ITechnologyDao;
import proje.OneOne.entities.Technologies;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class TechnologyManager implements ITechnologyService {
    private final ITechnologyDao iTechnologyDao;
    private final IModelMapperservice iModelMapperservice;

    public TechnologyManager(ITechnologyDao iTechnologyDao, IModelMapperservice iModelMapperservice) {
        this.iTechnologyDao = iTechnologyDao;
        this.iModelMapperservice = iModelMapperservice;
    }

    @Override
    public DataResult add(CreateTechnologyRequest createTechnologyRequest) {
        Technologies technologies=this.iModelMapperservice.forRequest().map(createTechnologyRequest,Technologies.class);
        return new ErrorDataResult<List<Technologies>>("Ekleme Başarısız");
    }

    @Override
    public DataResult update(UpdateTechnologyRequest updateTechnologyRequest) {
        Technologies technologies=this.iModelMapperservice.forRequest().map(updateTechnologyRequest,Technologies.class);
        return new SuccessDataResult(this.iTechnologyDao.findAll(),"update başarılı");
    }

    @Override
    public DataResult<List<GetAllTechnologyResponse>> getAllTech() {
        List<Technologies>technologies=iTechnologyDao.findAll();
        List<GetAllTechnologyResponse>getAllTechnologyResponses=technologies.stream().map(technologies1 -> this.iModelMapperservice.forResponse().map(technologies1,GetAllTechnologyResponse.class)).collect(Collectors.toList());

        return new SuccessDataResult<List<Technologies>>(this.iTechnologyDao.findAll(),"Listeledndi");
    }

    @Override
    public DataResult<GetByIdTechnologyResponse> getById(int id) {
        Technologies technologies=this.iTechnologyDao.findById(id).orElseThrow();
        GetByIdTechnologyResponse getByIdTechnologyResponse=this.iModelMapperservice.forResponse().map(technologies,GetByIdTechnologyResponse.class);

        return new SuccessDataResult<GetByIdTechnologyResponse>(getByIdTechnologyResponse,"eklendi");
    }

}

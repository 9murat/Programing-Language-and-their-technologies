package proje.OneOne.business.abstracts.technology;

import jdk.dynalink.linker.LinkerServices;
import proje.OneOne.business.request.technology.CreateTechnologyRequest;
import proje.OneOne.business.request.technology.UpdateTechnologyRequest;
import proje.OneOne.business.response.technology.GetAllTechnologyResponse;
import proje.OneOne.business.response.technology.GetByIdTechnologyResponse;
import proje.OneOne.core.utilities.Results.DataResult;
import proje.OneOne.core.utilities.Results.Result;

import java.util.List;

public interface ITechnologyService {
    DataResult add(CreateTechnologyRequest createTechnologyRequest);
    DataResult update(UpdateTechnologyRequest updateTechnologyRequest);

    DataResult<List<GetAllTechnologyResponse>> getAllTech();
    DataResult<GetByIdTechnologyResponse> getById(int id);
}

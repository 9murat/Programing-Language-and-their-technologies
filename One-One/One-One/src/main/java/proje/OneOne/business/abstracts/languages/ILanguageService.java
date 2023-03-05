package proje.OneOne.business.abstracts.languages;

import proje.OneOne.business.request.language.DeleteLanguageRequest;
import proje.OneOne.business.response.language.GetAllLanguageResponse;
import proje.OneOne.business.response.language.GetByIdLanguageResponse;
import proje.OneOne.core.utilities.Results.DataResult;
import proje.OneOne.core.utilities.Results.Result;

import java.util.List;

public interface ILanguageService {
    Result delete(int id);
    DataResult<List<GetAllLanguageResponse>>getAll();
   Result add(int id);

}

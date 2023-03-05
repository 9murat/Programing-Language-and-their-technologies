package proje.OneOne.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import proje.OneOne.business.abstracts.languages.ILanguageService;
import proje.OneOne.business.response.language.GetAllLanguageResponse;
import proje.OneOne.business.response.language.GetByIdLanguageResponse;
import proje.OneOne.core.utilities.Results.DataResult;
import proje.OneOne.core.utilities.Results.ErrorResult;
import proje.OneOne.core.utilities.Results.Result;
import proje.OneOne.core.utilities.Results.SuccesResult;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/languages")
@RestController
public class LanguageController {
    private ILanguageService iLanguageService;


    @GetMapping("/getList")
    public DataResult<List<GetAllLanguageResponse>> getAll(){
        return iLanguageService.getAll();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id){
        return iLanguageService.delete(id) ;
    }
    @PostMapping("/{id}")
    public void add(@PathVariable Integer id){
        this.iLanguageService.add(id) ;
    }

}

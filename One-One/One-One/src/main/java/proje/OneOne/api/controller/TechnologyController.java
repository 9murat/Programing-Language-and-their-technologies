package proje.OneOne.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proje.OneOne.business.abstracts.technology.ITechnologyService;
import proje.OneOne.business.request.technology.CreateTechnologyRequest;
import proje.OneOne.business.request.technology.UpdateTechnologyRequest;
import proje.OneOne.business.response.technology.GetAllTechnologyResponse;
import proje.OneOne.business.response.technology.GetByIdTechnologyResponse;
import proje.OneOne.core.utilities.Results.DataResult;
import proje.OneOne.core.utilities.Results.ErrorDataResult;
import proje.OneOne.core.utilities.Results.SuccesResult;
import proje.OneOne.core.utilities.Results.SuccessDataResult;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/technologies")
@RestController
public class TechnologyController {
    private ITechnologyService iTechnologyService;
    @GetMapping("/list")
    public ResponseEntity<DataResult<List<GetAllTechnologyResponse>>> getAlltech(){
        DataResult<List<GetAllTechnologyResponse>> response = this.iTechnologyService.getAllTech();
        if (response.isSuccess()) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
    @GetMapping("/{id}")
    public DataResult<GetByIdTechnologyResponse> getByIdTechnologyResponse(@PathVariable Integer id){
        return iTechnologyService.getById(id);
    }
    @PostMapping("/add")
   public DataResult add(CreateTechnologyRequest createTechnologyRequest){
      return new SuccessDataResult(this.iTechnologyService.add(createTechnologyRequest));

    }
    @PostMapping ("/update")
    public DataResult update(UpdateTechnologyRequest updateTechnologyRequest){
        return this.iTechnologyService.update(updateTechnologyRequest);
    }

}

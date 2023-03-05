package proje.OneOne.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface IModelMapperservice {
    ModelMapper forResponse();
    ModelMapper forRequest();
}

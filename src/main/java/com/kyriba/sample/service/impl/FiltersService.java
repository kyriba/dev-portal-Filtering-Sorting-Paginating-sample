package com.kyriba.sample.service.impl;

import com.kyriba.sample.config.FiltersConfig;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FiltersService {
        private final List<String> filters;


        public FiltersService(FiltersConfig fileTypesConfig){
            this.filters= fileTypesConfig.getFilters();
        }

        public List<String> getFilters(){
            return this.filters;
        }

}

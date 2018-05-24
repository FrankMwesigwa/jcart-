package com.jcart.modules.tracker.batch;

import lombok.Data;

@Data
public class BatchDTO {

    private Long id;
    private Long branch;
    private String name;
    private String description;

    public BatchDTO() {
    }

    public BatchDTO(Long id, Long branch, String name, String description) {
        this.id = id;
        this.branch = branch;
        this.name = name;
        this.description = description;
    }

}
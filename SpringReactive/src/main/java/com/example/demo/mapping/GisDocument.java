package com.example.demo.mapping;

import com.mongodb.client.model.geojson.Geometry;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@RequiredArgsConstructor
@Getter
@Setter
@Document(collection = "Topology")
public class GisDocument {


    @Id
    private String id;
    private String code;
    private String description;
    private String type;
    private String network_type;
    private String status;
    private String country;
    private Long start_date;
    private Long end_date;
    private String voltage;
    private org.bson.Document geometry;

}

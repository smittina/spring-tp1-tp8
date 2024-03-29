package com.training.springcore.service;

import com.training.springcore.model.Captor;
import com.training.springcore.service.measure.MeasureService;
import com.training.springcore.config.Monitored;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("captorService")
public class CaptorServiceImpl implements CaptorService{

    /**
     * Service FixedMeasure
     */
    MeasureService fixedMeasureService;
    /**
     * Service SimulatedMeasure
     */
    MeasureService simulatedMeasureService;
    /**
     * Service RealMeasure
     */
    MeasureService realMeasureService;



    /*@Autowired
    public CaptorServiceImpl(MeasureService fixedMeasureService,
                             MeasureService simulatedMeasureService,
                             MeasureService realMeasureService){
        this.fixedMeasureService = fixedMeasureService;
        this.simulatedMeasureService = simulatedMeasureService;
        this.realMeasureService = realMeasureService;
    }*/

    @Override
    @Monitored
    public Set<Captor> findBySite(String siteId) {
        Set<Captor> captors = new HashSet<>();
        if (siteId == null) {
            return captors;
        }
        captors.add(new Captor("Capteur A"));
        return captors;
    }
}

package org.oruko.dictionary.util;

import org.oruko.dictionary.model.GeoLocation;
import org.oruko.dictionary.model.NameEntry;
import org.oruko.dictionary.model.repository.GeoLocationRepository;
import org.oruko.dictionary.model.repository.NameEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Dadepo Aderemi.
 */
@Component
public class DatabaseImporter {

    @Autowired
    private GeoLocationRepository geoLocationRepository;

    @Autowired
    private NameEntryRepository nameEntryRepository;


    @PostConstruct
    public void initializeDb() {
//        North-West Yoruba (NWY): Abẹokuta, Ibadan, Ọyọ, Ogun and Lagos (Eko) areas
//        Central Yoruba (CY): Igbomina, Yagba, Ilésà, Ifẹ, Ekiti, Akurẹ, Ẹfọn, and Ijẹbu areas.
//        South-East Yoruba (SEY): Okitipupa, Ilaje, Ondo, Ọwọ, Ikarẹ, Ṣagamu, and parts of Ijẹbu.
        geoLocationRepository.save(new GeoLocation("ABEOKUTA", "NWY"));
        geoLocationRepository.save(new GeoLocation("IBADAN", "NWY"));
        geoLocationRepository.save(new GeoLocation("EKO", "NWY"));

        geoLocationRepository.save(new GeoLocation("IGBOMINA", "CY"));
        geoLocationRepository.save(new GeoLocation("YAGBA", "CY"));
        geoLocationRepository.save(new GeoLocation("ILESHA", "CY"));
        geoLocationRepository.save(new GeoLocation("IFE", "CY"));
        geoLocationRepository.save(new GeoLocation("EKITI", "CY"));
        geoLocationRepository.save(new GeoLocation("AKURE", "CY"));
        geoLocationRepository.save(new GeoLocation("EFON", "CY"));
        geoLocationRepository.save(new GeoLocation("IJEBU", "CY"));

        geoLocationRepository.save(new GeoLocation("OKITIPUPA", "SEY"));
        geoLocationRepository.save(new GeoLocation("IJALE", "SEY"));
        geoLocationRepository.save(new GeoLocation("ONDO", "SEY"));
        geoLocationRepository.save(new GeoLocation("OWO", "SEY"));
        geoLocationRepository.save(new GeoLocation("IKARE", "SEY"));
        geoLocationRepository.save(new GeoLocation("SAGAMU", "SEY"));



        // sample name entries
        NameEntry lagbaja = new NameEntry("lagbaja");
        NameEntry tamedo = new NameEntry("tamedo");
        NameEntry koko = new NameEntry("koko");
        NameEntry tola = new NameEntry("tola");
        NameEntry dadepo = new NameEntry("dadepo");
        NameEntry bolanle = new NameEntry("Bọ́lánlé");

        NameEntry ade0 = new NameEntry("Ade");
        NameEntry ade1 = new NameEntry("Adewale");
        NameEntry ade2 = new NameEntry("Adekunle");
        NameEntry ade3 = new NameEntry("Adetunji");
        NameEntry ade4 = new NameEntry("Adedotun");


        /**
         * Sample for search beahviour with variants and otherlanguages
         */
        NameEntry omowumi = new NameEntry("Omowumi");
        omowumi.setVariants("omawunmi, omawumi");
        omowumi.setInOtherLanguages("omewami");

        NameEntry omolabi = new NameEntry("Omolabi");

        nameEntryRepository.save(lagbaja);
        nameEntryRepository.save(tamedo);
        nameEntryRepository.save(koko);
        nameEntryRepository.save(tola);
        nameEntryRepository.save(tola);
        nameEntryRepository.save(dadepo);
        nameEntryRepository.save(bolanle);
        nameEntryRepository.save(ade0);
        nameEntryRepository.save(ade1);
        nameEntryRepository.save(ade2);
        nameEntryRepository.save(ade3);
        nameEntryRepository.save(ade4);
        nameEntryRepository.save(omowumi);
        nameEntryRepository.save(omolabi);
    }

}

package com.study.hexagonal.hexagonal_project.domain.entity;

import java.util.function.Predicate;
import com.study.hexagonal.hexagonal_project.domain.vo.IP;
import com.study.hexagonal.hexagonal_project.domain.vo.Id;
import com.study.hexagonal.hexagonal_project.domain.vo.Location;
import com.study.hexagonal.hexagonal_project.domain.vo.Model;
import com.study.hexagonal.hexagonal_project.domain.vo.Vendor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Equipment { // 장비

    protected final Id id;
    protected final Vendor vendor;
    protected final Model model;
    protected final IP ip;
    protected final Location location;


    public static Predicate<Equipment> getVendorPredicate(Vendor vendor) {
        return equipment -> equipment.getVendor().equals(vendor);
    }

}

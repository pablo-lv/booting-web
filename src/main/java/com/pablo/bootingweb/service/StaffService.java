package com.pablo.bootingweb.service;

import com.pablo.bootingweb.models.Position;
import com.pablo.bootingweb.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
    }

    public List<StaffMember> getAllStaff() {return staff;}
}

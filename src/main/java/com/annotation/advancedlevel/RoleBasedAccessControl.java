package com.annotation.advancedlevel;

import java.lang.reflect.Method;

// Class to demonstrate role-based access control
public class RoleBasedAccessControl {

    // Method that requires ADMIN role
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Executing admin task");
    }

    // Method that requires USER role
    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("Executing user task");
    }

    // Method to check if a user has access to a method
    public void checkAccess(User user, Method method) throws Exception {
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (!roleAllowed.value().equals(user.getRole())) {
                System.out.println("Access Denied!");
                return;
            }
        }
        method.invoke(this);
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of RoleBasedAccessControl
        RoleBasedAccessControl rbac = new RoleBasedAccessControl();
        User admin = new User("ADMIN");
        User user = new User("USER");

        // Check access for admin and user roles
        rbac.checkAccess(admin, RoleBasedAccessControl.class.getMethod("adminTask"));
        rbac.checkAccess(user, RoleBasedAccessControl.class.getMethod("adminTask"));
        rbac.checkAccess(user, RoleBasedAccessControl.class.getMethod("userTask"));
    }
}

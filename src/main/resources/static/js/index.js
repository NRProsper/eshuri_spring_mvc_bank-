$(document).ready( () => {
    $("#create-account-form").submit(function (event) {
        event.preventDefault();

        let isValid = true;
        let formData = $(this).serialize();

        if(isValid) {
            $.ajax({
                url: "/account/create",
                method: "POST",
                data: formData,
                success: function (response) {
                    alert("Account created Successfully");
                    window.location.href("/account");
                },
                error: function (error) {
                    alert("Failed to create account. Please try again.");
                }
            })
        }

    })
})
$(document).ready(function() {
    initProductTable();
});

function initProductTable(){
    let productTable = $('#productTable').DataTable( {
        processing: true,
        stateSave:true,
        serverSide: true,
        language: {
        sInfoEmpty: "0 Products",
        emptyTable: "No products added yet",
        searchPlaceholder: "Search Products"
        },
        lengthMenu: [[1, 2, 5, -1], [1, 2, 5, 'All']],
        sAjaxSource: "/products/get-products",
        sAjaxDataProp: "",
        order: [[ 0, "asc" ]],
        stateSaveCallback: function (settings, data) {
            let formData = new FormData();
            // console.log(JSON.stringify(data));
            formData.append("state", JSON.stringify(data));
            $.ajax({
                url: "/products/state_save",
                data: formData,
                type: "POST",
                processData: false,
                contentType: false,
                success: function (e) {
                    if(e === "success"){
                        console.log("state saved");
                    }
                },
                error: function(e){
                    console.log((e));
                },
            });
        },
        stateLoadCallback: function (settings) {
            let state = '';
            $.ajax( {
                url: '/products/state_load',
                dataType: 'json',
                error: function(response){
                    console.log("Error");
                    console.log(response.responseText);
                },
                success: function (response) {
                    console.log("Success");
                    console.log(response);
                    state = response;
                    //callback ( state );
                }
            });
            return state;
        },
        aoColumns: [
            { mData: 'id' },
            { mData: 'name' },
            { mData: 'description' },
            { mData: 'brand' },
            { mData: 'price' },
            { mData: 'units' },
        ],
    });
}
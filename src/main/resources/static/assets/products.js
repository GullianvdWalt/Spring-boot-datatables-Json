$(document).ready(function() {
    initProductTable();
});

function initProductTable(){
    let productTable = $('#productTable').DataTable( {
        processing: true,
        stateSave:true,
        serverSide: true,
        stateSaveCallback: function (settings, data) {
            let formData = new FormData();
            formData.append("state", JSON.stringify(data));
            $.ajax({
                url: "/products/state_save",
                data: formData,
                dataType: "json",
                type: "POST",
                processData: false,
                contentType: false,
                error: function(e){
                  console.log((e));
                },
                success: function (e) {
                    console.log(e);
                    if(e === "success"){
                        console.log("state saved");
                    }
                }
            });
        },
        stateLoadCallback: function (settings, callback) {
            let state = '';
            $.ajax( {
                url: '/products/state_load',
                dataType: 'json',
                error: function(response){
                  console.log(response);
                },
                success: function (response) {
                    console.log(response);
                    state = response;
                }
            });
            return state;
        },
        language: {
        sInfoEmpty: "0 Products",
        emptyTable: "No products added yet",
        searchPlaceholder: "Search Products"
        },
        lengthMenu: [[1, 2, 5, -1], [1, 2, 5, 'All']],
        sAjaxSource: "/products/get-products",
        sAjaxDataProp: "",
        order: [[ 0, "asc" ]],
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
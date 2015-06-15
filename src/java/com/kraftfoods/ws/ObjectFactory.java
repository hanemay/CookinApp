
package com.kraftfoods.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kraftfoods.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RecipeSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeSummariesResponse");
    private final static QName _GetRecipeCategoryResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "GetRecipeCategoryResponse");
    private final static QName _GetRecipeClassificationResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "GetRecipeClassificationResponse");
    private final static QName _GetRecipeSubCategoryResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "GetRecipeSubCategoryResponse");
    private final static QName _RecipeVideosResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeVideosResponse");
    private final static QName _ROTDSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "ROTDSummariesResponse");
    private final static QName _MemberRecipeDetailResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "MemberRecipeDetailResponse");
    private final static QName _RecipeDetailResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeDetailResponse");
    private final static QName _RatingsPagedResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RatingsPagedResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "LoginResponse");
    private final static QName _ForgotPasswordCallResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "ForgotPasswordCallResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "LogoutResponse");
    private final static QName _RecipeBoxResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeBoxResponse");
    private final static QName _StatusResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "StatusResponse");
    private final static QName _RecipeBoxRecipeSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeBoxRecipeSummariesResponse");
    private final static QName _RecipeInRecipeBoxResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeInRecipeBoxResponse");
    private final static QName _ShoppingListsResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "ShoppingListsResponse");
    private final static QName _ShoppingListResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "ShoppingListResponse");
    private final static QName _SortedShoppingListResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "SortedShoppingListResponse");
    private final static QName _EditShoppingListItemResponseNew_QNAME = new QName("http://www.kraftfoods.com/ws/", "EditShoppingListItemResponseNew");
    private final static QName _AddItemToShoppingListResponseNew_QNAME = new QName("http://www.kraftfoods.com/ws/", "AddItemToShoppingListResponseNew");
    private final static QName _RecipeBoxShoppingListResponses_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeBoxShoppingListResponses");
    private final static QName _RecipeBoxShoppingListResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeBoxShoppingListResponse");
    private final static QName _StoreSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "StoreSummariesResponse");
    private final static QName _CoremetricsResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "CoremetricsResponse");
    private final static QName _VideoRecipeSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "VideoRecipeSummariesResponse");
    private final static QName _DTSummariesResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "DTSummariesResponse");
    private final static QName _RecipeSubCategoryResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeSubCategoryResponse");
    private final static QName _PollDetailsResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "PollDetailsResponse");
    private final static QName _String_QNAME = new QName("http://www.kraftfoods.com/ws/", "string");
    private final static QName _AnyType_QNAME = new QName("http://www.kraftfoods.com/ws/", "anyType");
    private final static QName _SiteUserAcctPointsLeftResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "SiteUserAcctPointsLeftResponse");
    private final static QName _RecipeSummaryDetailsResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeSummaryDetailsResponse");
    private final static QName _RecipeDetailResponses_QNAME = new QName("http://www.kraftfoods.com/ws/", "RecipeDetailResponses");
    private final static QName _OptinSummaryResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "OptinSummaryResponse");
    private final static QName _UpadteUserAnswerResponse_QNAME = new QName("http://www.kraftfoods.com/ws/", "UpadteUserAnswerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kraftfoods.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExecuteRecipeSearch }
     * 
     */
    public ExecuteRecipeSearch createExecuteRecipeSearch() {
        return new ExecuteRecipeSearch();
    }

    /**
     * Create an instance of {@link ExecuteRecipeSearchResponse }
     * 
     */
    public ExecuteRecipeSearchResponse createExecuteRecipeSearchResponse() {
        return new ExecuteRecipeSearchResponse();
    }

    /**
     * Create an instance of {@link RecipeSummariesResponse }
     * 
     */
    public RecipeSummariesResponse createRecipeSummariesResponse() {
        return new RecipeSummariesResponse();
    }

    /**
     * Create an instance of {@link GetRecipesBySubcategoryWithExtraInformation }
     * 
     */
    public GetRecipesBySubcategoryWithExtraInformation createGetRecipesBySubcategoryWithExtraInformation() {
        return new GetRecipesBySubcategoryWithExtraInformation();
    }

    /**
     * Create an instance of {@link GetRecipesBySubcategoryWithExtraInformationResponse }
     * 
     */
    public GetRecipesBySubcategoryWithExtraInformationResponse createGetRecipesBySubcategoryWithExtraInformationResponse() {
        return new GetRecipesBySubcategoryWithExtraInformationResponse();
    }

    /**
     * Create an instance of {@link GetRecipesBySubcategory }
     * 
     */
    public GetRecipesBySubcategory createGetRecipesBySubcategory() {
        return new GetRecipesBySubcategory();
    }

    /**
     * Create an instance of {@link GetRecipesBySubcategoryResponse }
     * 
     */
    public GetRecipesBySubcategoryResponse createGetRecipesBySubcategoryResponse() {
        return new GetRecipesBySubcategoryResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByCategory }
     * 
     */
    public GetRecipesByCategory createGetRecipesByCategory() {
        return new GetRecipesByCategory();
    }

    /**
     * Create an instance of {@link GetRecipesByCategoryResponse }
     * 
     */
    public GetRecipesByCategoryResponse createGetRecipesByCategoryResponse() {
        return new GetRecipesByCategoryResponse();
    }

    /**
     * Create an instance of {@link GetRecipeCategories }
     * 
     */
    public GetRecipeCategories createGetRecipeCategories() {
        return new GetRecipeCategories();
    }

    /**
     * Create an instance of {@link GetRecipeCategoriesResponse }
     * 
     */
    public GetRecipeCategoriesResponse createGetRecipeCategoriesResponse() {
        return new GetRecipeCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetRecipeCategoryResponse }
     * 
     */
    public GetRecipeCategoryResponse createGetRecipeCategoryResponse() {
        return new GetRecipeCategoryResponse();
    }

    /**
     * Create an instance of {@link GetRecipeClassifications }
     * 
     */
    public GetRecipeClassifications createGetRecipeClassifications() {
        return new GetRecipeClassifications();
    }

    /**
     * Create an instance of {@link GetRecipeClassificationsResponse }
     * 
     */
    public GetRecipeClassificationsResponse createGetRecipeClassificationsResponse() {
        return new GetRecipeClassificationsResponse();
    }

    /**
     * Create an instance of {@link GetRecipeClassificationResponse }
     * 
     */
    public GetRecipeClassificationResponse createGetRecipeClassificationResponse() {
        return new GetRecipeClassificationResponse();
    }

    /**
     * Create an instance of {@link GetRecipeSubCategories }
     * 
     */
    public GetRecipeSubCategories createGetRecipeSubCategories() {
        return new GetRecipeSubCategories();
    }

    /**
     * Create an instance of {@link GetRecipeSubCategoriesResponse }
     * 
     */
    public GetRecipeSubCategoriesResponse createGetRecipeSubCategoriesResponse() {
        return new GetRecipeSubCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetRecipeSubCategoryResponse }
     * 
     */
    public GetRecipeSubCategoryResponse createGetRecipeSubCategoryResponse() {
        return new GetRecipeSubCategoryResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywords }
     * 
     */
    public GetRecipesByKeywords createGetRecipesByKeywords() {
        return new GetRecipesByKeywords();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsResponse }
     * 
     */
    public GetRecipesByKeywordsResponse createGetRecipesByKeywordsResponse() {
        return new GetRecipesByKeywordsResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByIngredients }
     * 
     */
    public GetRecipesByIngredients createGetRecipesByIngredients() {
        return new GetRecipesByIngredients();
    }

    /**
     * Create an instance of {@link GetRecipesByIngredientsResponse }
     * 
     */
    public GetRecipesByIngredientsResponse createGetRecipesByIngredientsResponse() {
        return new GetRecipesByIngredientsResponse();
    }

    /**
     * Create an instance of {@link GetRecipeVideos }
     * 
     */
    public GetRecipeVideos createGetRecipeVideos() {
        return new GetRecipeVideos();
    }

    /**
     * Create an instance of {@link GetRecipeVideosResponse }
     * 
     */
    public GetRecipeVideosResponse createGetRecipeVideosResponse() {
        return new GetRecipeVideosResponse();
    }

    /**
     * Create an instance of {@link RecipeVideosResponse }
     * 
     */
    public RecipeVideosResponse createRecipeVideosResponse() {
        return new RecipeVideosResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsAndCategoryGroup }
     * 
     */
    public GetRecipesByKeywordsAndCategoryGroup createGetRecipesByKeywordsAndCategoryGroup() {
        return new GetRecipesByKeywordsAndCategoryGroup();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsAndCategoryGroupResponse }
     * 
     */
    public GetRecipesByKeywordsAndCategoryGroupResponse createGetRecipesByKeywordsAndCategoryGroupResponse() {
        return new GetRecipesByKeywordsAndCategoryGroupResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsAndSubcategory }
     * 
     */
    public GetRecipesByKeywordsAndSubcategory createGetRecipesByKeywordsAndSubcategory() {
        return new GetRecipesByKeywordsAndSubcategory();
    }

    /**
     * Create an instance of {@link GetRecipesByKeywordsAndSubcategoryResponse }
     * 
     */
    public GetRecipesByKeywordsAndSubcategoryResponse createGetRecipesByKeywordsAndSubcategoryResponse() {
        return new GetRecipesByKeywordsAndSubcategoryResponse();
    }

    /**
     * Create an instance of {@link GetHealthyLivingRecipes }
     * 
     */
    public GetHealthyLivingRecipes createGetHealthyLivingRecipes() {
        return new GetHealthyLivingRecipes();
    }

    /**
     * Create an instance of {@link GetHealthyLivingRecipesResponse }
     * 
     */
    public GetHealthyLivingRecipesResponse createGetHealthyLivingRecipesResponse() {
        return new GetHealthyLivingRecipesResponse();
    }

    /**
     * Create an instance of {@link GetRecipesOfTheWeek }
     * 
     */
    public GetRecipesOfTheWeek createGetRecipesOfTheWeek() {
        return new GetRecipesOfTheWeek();
    }

    /**
     * Create an instance of {@link GetRecipesOfTheWeekResponse }
     * 
     */
    public GetRecipesOfTheWeekResponse createGetRecipesOfTheWeekResponse() {
        return new GetRecipesOfTheWeekResponse();
    }

    /**
     * Create an instance of {@link ROTDSummariesResponse }
     * 
     */
    public ROTDSummariesResponse createROTDSummariesResponse() {
        return new ROTDSummariesResponse();
    }

    /**
     * Create an instance of {@link GetRecipeOfTheDay }
     * 
     */
    public GetRecipeOfTheDay createGetRecipeOfTheDay() {
        return new GetRecipeOfTheDay();
    }

    /**
     * Create an instance of {@link GetRecipeOfTheDayResponse }
     * 
     */
    public GetRecipeOfTheDayResponse createGetRecipeOfTheDayResponse() {
        return new GetRecipeOfTheDayResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByRecipeIDs }
     * 
     */
    public GetRecipesByRecipeIDs createGetRecipesByRecipeIDs() {
        return new GetRecipesByRecipeIDs();
    }

    /**
     * Create an instance of {@link GetRecipesByRecipeIDsResponse }
     * 
     */
    public GetRecipesByRecipeIDsResponse createGetRecipesByRecipeIDsResponse() {
        return new GetRecipesByRecipeIDsResponse();
    }

    /**
     * Create an instance of {@link GetUserRecipeByUserRecipeID }
     * 
     */
    public GetUserRecipeByUserRecipeID createGetUserRecipeByUserRecipeID() {
        return new GetUserRecipeByUserRecipeID();
    }

    /**
     * Create an instance of {@link GetUserRecipeByUserRecipeIDResponse }
     * 
     */
    public GetUserRecipeByUserRecipeIDResponse createGetUserRecipeByUserRecipeIDResponse() {
        return new GetUserRecipeByUserRecipeIDResponse();
    }

    /**
     * Create an instance of {@link MemberRecipeDetailResponse }
     * 
     */
    public MemberRecipeDetailResponse createMemberRecipeDetailResponse() {
        return new MemberRecipeDetailResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByRecipeIDsWithExtraInformation }
     * 
     */
    public GetRecipesByRecipeIDsWithExtraInformation createGetRecipesByRecipeIDsWithExtraInformation() {
        return new GetRecipesByRecipeIDsWithExtraInformation();
    }

    /**
     * Create an instance of {@link GetRecipesByRecipeIDsWithExtraInformationResponse }
     * 
     */
    public GetRecipesByRecipeIDsWithExtraInformationResponse createGetRecipesByRecipeIDsWithExtraInformationResponse() {
        return new GetRecipesByRecipeIDsWithExtraInformationResponse();
    }

    /**
     * Create an instance of {@link GetRecipeByRecipeID }
     * 
     */
    public GetRecipeByRecipeID createGetRecipeByRecipeID() {
        return new GetRecipeByRecipeID();
    }

    /**
     * Create an instance of {@link GetRecipeByRecipeIDResponse }
     * 
     */
    public GetRecipeByRecipeIDResponse createGetRecipeByRecipeIDResponse() {
        return new GetRecipeByRecipeIDResponse();
    }

    /**
     * Create an instance of {@link RecipeDetailResponse }
     * 
     */
    public RecipeDetailResponse createRecipeDetailResponse() {
        return new RecipeDetailResponse();
    }

    /**
     * Create an instance of {@link GetRecipeByRecipeIDWithExtraInformation }
     * 
     */
    public GetRecipeByRecipeIDWithExtraInformation createGetRecipeByRecipeIDWithExtraInformation() {
        return new GetRecipeByRecipeIDWithExtraInformation();
    }

    /**
     * Create an instance of {@link GetRecipeByRecipeIDWithExtraInformationResponse }
     * 
     */
    public GetRecipeByRecipeIDWithExtraInformationResponse createGetRecipeByRecipeIDWithExtraInformationResponse() {
        return new GetRecipeByRecipeIDWithExtraInformationResponse();
    }

    /**
     * Create an instance of {@link GetRatingsPaged }
     * 
     */
    public GetRatingsPaged createGetRatingsPaged() {
        return new GetRatingsPaged();
    }

    /**
     * Create an instance of {@link GetRatingsPagedResponse }
     * 
     */
    public GetRatingsPagedResponse createGetRatingsPagedResponse() {
        return new GetRatingsPagedResponse();
    }

    /**
     * Create an instance of {@link RatingsPagedResponse }
     * 
     */
    public RatingsPagedResponse createRatingsPagedResponse() {
        return new RatingsPagedResponse();
    }

    /**
     * Create an instance of {@link GetRatingsPagedByRatingType }
     * 
     */
    public GetRatingsPagedByRatingType createGetRatingsPagedByRatingType() {
        return new GetRatingsPagedByRatingType();
    }

    /**
     * Create an instance of {@link GetRatingsPagedByRatingTypeResponse }
     * 
     */
    public GetRatingsPagedByRatingTypeResponse createGetRatingsPagedByRatingTypeResponse() {
        return new GetRatingsPagedByRatingTypeResponse();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookie }
     * 
     */
    public LoginUserAndReturnCookie createLoginUserAndReturnCookie() {
        return new LoginUserAndReturnCookie();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieResponse }
     * 
     */
    public LoginUserAndReturnCookieResponse createLoginUserAndReturnCookieResponse() {
        return new LoginUserAndReturnCookieResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieWithExtraUserInfo }
     * 
     */
    public LoginUserAndReturnCookieWithExtraUserInfo createLoginUserAndReturnCookieWithExtraUserInfo() {
        return new LoginUserAndReturnCookieWithExtraUserInfo();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieWithExtraUserInfoResponse }
     * 
     */
    public LoginUserAndReturnCookieWithExtraUserInfoResponse createLoginUserAndReturnCookieWithExtraUserInfoResponse() {
        return new LoginUserAndReturnCookieWithExtraUserInfoResponse();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieWithEncryptedPassword }
     * 
     */
    public LoginUserAndReturnCookieWithEncryptedPassword createLoginUserAndReturnCookieWithEncryptedPassword() {
        return new LoginUserAndReturnCookieWithEncryptedPassword();
    }

    /**
     * Create an instance of {@link LoginUserAndReturnCookieWithEncryptedPasswordResponse }
     * 
     */
    public LoginUserAndReturnCookieWithEncryptedPasswordResponse createLoginUserAndReturnCookieWithEncryptedPasswordResponse() {
        return new LoginUserAndReturnCookieWithEncryptedPasswordResponse();
    }

    /**
     * Create an instance of {@link ForgotPassword }
     * 
     */
    public ForgotPassword createForgotPassword() {
        return new ForgotPassword();
    }

    /**
     * Create an instance of {@link ForgotPasswordResponse }
     * 
     */
    public ForgotPasswordResponse createForgotPasswordResponse() {
        return new ForgotPasswordResponse();
    }

    /**
     * Create an instance of {@link ForgotPasswordCallResponse }
     * 
     */
    public ForgotPasswordCallResponse createForgotPasswordCallResponse() {
        return new ForgotPasswordCallResponse();
    }

    /**
     * Create an instance of {@link ForgotPasswordByLangID }
     * 
     */
    public ForgotPasswordByLangID createForgotPasswordByLangID() {
        return new ForgotPasswordByLangID();
    }

    /**
     * Create an instance of {@link ForgotPasswordByLangIDResponse }
     * 
     */
    public ForgotPasswordByLangIDResponse createForgotPasswordByLangIDResponse() {
        return new ForgotPasswordByLangIDResponse();
    }

    /**
     * Create an instance of {@link LogoutUserAndReturnCookie }
     * 
     */
    public LogoutUserAndReturnCookie createLogoutUserAndReturnCookie() {
        return new LogoutUserAndReturnCookie();
    }

    /**
     * Create an instance of {@link LogoutUserAndReturnCookieResponse }
     * 
     */
    public LogoutUserAndReturnCookieResponse createLogoutUserAndReturnCookieResponse() {
        return new LogoutUserAndReturnCookieResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link RegisterNewUser }
     * 
     */
    public RegisterNewUser createRegisterNewUser() {
        return new RegisterNewUser();
    }

    /**
     * Create an instance of {@link RegisterNewUserResponse }
     * 
     */
    public RegisterNewUserResponse createRegisterNewUserResponse() {
        return new RegisterNewUserResponse();
    }

    /**
     * Create an instance of {@link RegisterNewUserWithExtraUserInfo }
     * 
     */
    public RegisterNewUserWithExtraUserInfo createRegisterNewUserWithExtraUserInfo() {
        return new RegisterNewUserWithExtraUserInfo();
    }

    /**
     * Create an instance of {@link RegisterNewUserWithExtraUserInfoResponse }
     * 
     */
    public RegisterNewUserWithExtraUserInfoResponse createRegisterNewUserWithExtraUserInfoResponse() {
        return new RegisterNewUserWithExtraUserInfoResponse();
    }

    /**
     * Create an instance of {@link UpdateUserProfile }
     * 
     */
    public UpdateUserProfile createUpdateUserProfile() {
        return new UpdateUserProfile();
    }

    /**
     * Create an instance of {@link UpdateUserProfileResponse }
     * 
     */
    public UpdateUserProfileResponse createUpdateUserProfileResponse() {
        return new UpdateUserProfileResponse();
    }

    /**
     * Create an instance of {@link AddRecipeToRecipeBox }
     * 
     */
    public AddRecipeToRecipeBox createAddRecipeToRecipeBox() {
        return new AddRecipeToRecipeBox();
    }

    /**
     * Create an instance of {@link AddRecipeToRecipeBoxResponse }
     * 
     */
    public AddRecipeToRecipeBoxResponse createAddRecipeToRecipeBoxResponse() {
        return new AddRecipeToRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link RecipeBoxResponse }
     * 
     */
    public RecipeBoxResponse createRecipeBoxResponse() {
        return new RecipeBoxResponse();
    }

    /**
     * Create an instance of {@link AddRecipesToRecipeBox }
     * 
     */
    public AddRecipesToRecipeBox createAddRecipesToRecipeBox() {
        return new AddRecipesToRecipeBox();
    }

    /**
     * Create an instance of {@link AddRecipesToRecipeBoxResponse }
     * 
     */
    public AddRecipesToRecipeBoxResponse createAddRecipesToRecipeBoxResponse() {
        return new AddRecipesToRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link DeleteRecipeFromRecipeBox }
     * 
     */
    public DeleteRecipeFromRecipeBox createDeleteRecipeFromRecipeBox() {
        return new DeleteRecipeFromRecipeBox();
    }

    /**
     * Create an instance of {@link DeleteRecipeFromRecipeBoxResponse }
     * 
     */
    public DeleteRecipeFromRecipeBoxResponse createDeleteRecipeFromRecipeBoxResponse() {
        return new DeleteRecipeFromRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link DeleteRecipesFromRecipeBox }
     * 
     */
    public DeleteRecipesFromRecipeBox createDeleteRecipesFromRecipeBox() {
        return new DeleteRecipesFromRecipeBox();
    }

    /**
     * Create an instance of {@link DeleteRecipesFromRecipeBoxResponse }
     * 
     */
    public DeleteRecipesFromRecipeBoxResponse createDeleteRecipesFromRecipeBoxResponse() {
        return new DeleteRecipesFromRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link GetRecipesFromRecipeBox }
     * 
     */
    public GetRecipesFromRecipeBox createGetRecipesFromRecipeBox() {
        return new GetRecipesFromRecipeBox();
    }

    /**
     * Create an instance of {@link GetRecipesFromRecipeBoxResponse }
     * 
     */
    public GetRecipesFromRecipeBoxResponse createGetRecipesFromRecipeBoxResponse() {
        return new GetRecipesFromRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link RecipeBoxRecipeSummariesResponse }
     * 
     */
    public RecipeBoxRecipeSummariesResponse createRecipeBoxRecipeSummariesResponse() {
        return new RecipeBoxRecipeSummariesResponse();
    }

    /**
     * Create an instance of {@link GetRecipesFromRecipeBoxByCategory }
     * 
     */
    public GetRecipesFromRecipeBoxByCategory createGetRecipesFromRecipeBoxByCategory() {
        return new GetRecipesFromRecipeBoxByCategory();
    }

    /**
     * Create an instance of {@link GetRecipesFromRecipeBoxByCategoryResponse }
     * 
     */
    public GetRecipesFromRecipeBoxByCategoryResponse createGetRecipesFromRecipeBoxByCategoryResponse() {
        return new GetRecipesFromRecipeBoxByCategoryResponse();
    }

    /**
     * Create an instance of {@link IsRecipeInRecipeBox }
     * 
     */
    public IsRecipeInRecipeBox createIsRecipeInRecipeBox() {
        return new IsRecipeInRecipeBox();
    }

    /**
     * Create an instance of {@link IsRecipeInRecipeBoxResponse }
     * 
     */
    public IsRecipeInRecipeBoxResponse createIsRecipeInRecipeBoxResponse() {
        return new IsRecipeInRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link RecipeInRecipeBoxResponse }
     * 
     */
    public RecipeInRecipeBoxResponse createRecipeInRecipeBoxResponse() {
        return new RecipeInRecipeBoxResponse();
    }

    /**
     * Create an instance of {@link GetShoppingLists }
     * 
     */
    public GetShoppingLists createGetShoppingLists() {
        return new GetShoppingLists();
    }

    /**
     * Create an instance of {@link GetShoppingListsResponse }
     * 
     */
    public GetShoppingListsResponse createGetShoppingListsResponse() {
        return new GetShoppingListsResponse();
    }

    /**
     * Create an instance of {@link ShoppingListsResponse }
     * 
     */
    public ShoppingListsResponse createShoppingListsResponse() {
        return new ShoppingListsResponse();
    }

    /**
     * Create an instance of {@link GetDefaultShoppingList }
     * 
     */
    public GetDefaultShoppingList createGetDefaultShoppingList() {
        return new GetDefaultShoppingList();
    }

    /**
     * Create an instance of {@link GetDefaultShoppingListResponse }
     * 
     */
    public GetDefaultShoppingListResponse createGetDefaultShoppingListResponse() {
        return new GetDefaultShoppingListResponse();
    }

    /**
     * Create an instance of {@link ShoppingListResponse }
     * 
     */
    public ShoppingListResponse createShoppingListResponse() {
        return new ShoppingListResponse();
    }

    /**
     * Create an instance of {@link GetShoppingListSorted }
     * 
     */
    public GetShoppingListSorted createGetShoppingListSorted() {
        return new GetShoppingListSorted();
    }

    /**
     * Create an instance of {@link GetShoppingListSortedResponse }
     * 
     */
    public GetShoppingListSortedResponse createGetShoppingListSortedResponse() {
        return new GetShoppingListSortedResponse();
    }

    /**
     * Create an instance of {@link SortedShoppingListResponse }
     * 
     */
    public SortedShoppingListResponse createSortedShoppingListResponse() {
        return new SortedShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddShoppingList }
     * 
     */
    public AddShoppingList createAddShoppingList() {
        return new AddShoppingList();
    }

    /**
     * Create an instance of {@link AddShoppingListResponse }
     * 
     */
    public AddShoppingListResponse createAddShoppingListResponse() {
        return new AddShoppingListResponse();
    }

    /**
     * Create an instance of {@link EditShoppingList }
     * 
     */
    public EditShoppingList createEditShoppingList() {
        return new EditShoppingList();
    }

    /**
     * Create an instance of {@link EditShoppingListResponse }
     * 
     */
    public EditShoppingListResponse createEditShoppingListResponse() {
        return new EditShoppingListResponse();
    }

    /**
     * Create an instance of {@link EditShoppingListItem }
     * 
     */
    public EditShoppingListItem createEditShoppingListItem() {
        return new EditShoppingListItem();
    }

    /**
     * Create an instance of {@link EditShoppingListItemResponse }
     * 
     */
    public EditShoppingListItemResponse createEditShoppingListItemResponse() {
        return new EditShoppingListItemResponse();
    }

    /**
     * Create an instance of {@link EditShoppingListItemResponseNew }
     * 
     */
    public EditShoppingListItemResponseNew createEditShoppingListItemResponseNew() {
        return new EditShoppingListItemResponseNew();
    }

    /**
     * Create an instance of {@link DeleteShoppingList }
     * 
     */
    public DeleteShoppingList createDeleteShoppingList() {
        return new DeleteShoppingList();
    }

    /**
     * Create an instance of {@link DeleteShoppingListResponse }
     * 
     */
    public DeleteShoppingListResponse createDeleteShoppingListResponse() {
        return new DeleteShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddItemToShoppingList }
     * 
     */
    public AddItemToShoppingList createAddItemToShoppingList() {
        return new AddItemToShoppingList();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListResponse }
     * 
     */
    public AddItemToShoppingListResponse createAddItemToShoppingListResponse() {
        return new AddItemToShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListReturnItemListId }
     * 
     */
    public AddItemToShoppingListReturnItemListId createAddItemToShoppingListReturnItemListId() {
        return new AddItemToShoppingListReturnItemListId();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListReturnItemListIdResponse }
     * 
     */
    public AddItemToShoppingListReturnItemListIdResponse createAddItemToShoppingListReturnItemListIdResponse() {
        return new AddItemToShoppingListReturnItemListIdResponse();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListResponseNew }
     * 
     */
    public AddItemToShoppingListResponseNew createAddItemToShoppingListResponseNew() {
        return new AddItemToShoppingListResponseNew();
    }

    /**
     * Create an instance of {@link AddItemsToShoppingListReturnItemListIds }
     * 
     */
    public AddItemsToShoppingListReturnItemListIds createAddItemsToShoppingListReturnItemListIds() {
        return new AddItemsToShoppingListReturnItemListIds();
    }

    /**
     * Create an instance of {@link AddItemsToShoppingListReturnItemListIdsResponse }
     * 
     */
    public AddItemsToShoppingListReturnItemListIdsResponse createAddItemsToShoppingListReturnItemListIdsResponse() {
        return new AddItemsToShoppingListReturnItemListIdsResponse();
    }

    /**
     * Create an instance of {@link DeleteItemFromShoppingList }
     * 
     */
    public DeleteItemFromShoppingList createDeleteItemFromShoppingList() {
        return new DeleteItemFromShoppingList();
    }

    /**
     * Create an instance of {@link DeleteItemFromShoppingListResponse }
     * 
     */
    public DeleteItemFromShoppingListResponse createDeleteItemFromShoppingListResponse() {
        return new DeleteItemFromShoppingListResponse();
    }

    /**
     * Create an instance of {@link DeleteItemsFromShoppingList }
     * 
     */
    public DeleteItemsFromShoppingList createDeleteItemsFromShoppingList() {
        return new DeleteItemsFromShoppingList();
    }

    /**
     * Create an instance of {@link DeleteItemsFromShoppingListResponse }
     * 
     */
    public DeleteItemsFromShoppingListResponse createDeleteItemsFromShoppingListResponse() {
        return new DeleteItemsFromShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddRecipeToShoppingList }
     * 
     */
    public AddRecipeToShoppingList createAddRecipeToShoppingList() {
        return new AddRecipeToShoppingList();
    }

    /**
     * Create an instance of {@link AddRecipeToShoppingListResponse }
     * 
     */
    public AddRecipeToShoppingListResponse createAddRecipeToShoppingListResponse() {
        return new AddRecipeToShoppingListResponse();
    }

    /**
     * Create an instance of {@link AddRecipesToShoppingList }
     * 
     */
    public AddRecipesToShoppingList createAddRecipesToShoppingList() {
        return new AddRecipesToShoppingList();
    }

    /**
     * Create an instance of {@link AddRecipesToShoppingListResponse }
     * 
     */
    public AddRecipesToShoppingListResponse createAddRecipesToShoppingListResponse() {
        return new AddRecipesToShoppingListResponse();
    }

    /**
     * Create an instance of {@link RecipeBoxShoppingListResponses }
     * 
     */
    public RecipeBoxShoppingListResponses createRecipeBoxShoppingListResponses() {
        return new RecipeBoxShoppingListResponses();
    }

    /**
     * Create an instance of {@link AddRecipeToRecipeBoxShoppingList }
     * 
     */
    public AddRecipeToRecipeBoxShoppingList createAddRecipeToRecipeBoxShoppingList() {
        return new AddRecipeToRecipeBoxShoppingList();
    }

    /**
     * Create an instance of {@link AddRecipeToRecipeBoxShoppingListResponse }
     * 
     */
    public AddRecipeToRecipeBoxShoppingListResponse createAddRecipeToRecipeBoxShoppingListResponse() {
        return new AddRecipeToRecipeBoxShoppingListResponse();
    }

    /**
     * Create an instance of {@link RecipeBoxShoppingListResponse }
     * 
     */
    public RecipeBoxShoppingListResponse createRecipeBoxShoppingListResponse() {
        return new RecipeBoxShoppingListResponse();
    }

    /**
     * Create an instance of {@link GetStoresByLatAndLong }
     * 
     */
    public GetStoresByLatAndLong createGetStoresByLatAndLong() {
        return new GetStoresByLatAndLong();
    }

    /**
     * Create an instance of {@link GetStoresByLatAndLongResponse }
     * 
     */
    public GetStoresByLatAndLongResponse createGetStoresByLatAndLongResponse() {
        return new GetStoresByLatAndLongResponse();
    }

    /**
     * Create an instance of {@link StoreSummariesResponse }
     * 
     */
    public StoreSummariesResponse createStoreSummariesResponse() {
        return new StoreSummariesResponse();
    }

    /**
     * Create an instance of {@link GetCoremetricsVisitorID }
     * 
     */
    public GetCoremetricsVisitorID createGetCoremetricsVisitorID() {
        return new GetCoremetricsVisitorID();
    }

    /**
     * Create an instance of {@link GetCoremetricsVisitorIDResponse }
     * 
     */
    public GetCoremetricsVisitorIDResponse createGetCoremetricsVisitorIDResponse() {
        return new GetCoremetricsVisitorIDResponse();
    }

    /**
     * Create an instance of {@link CoremetricsResponse }
     * 
     */
    public CoremetricsResponse createCoremetricsResponse() {
        return new CoremetricsResponse();
    }

    /**
     * Create an instance of {@link GetCoremetricsSessionID }
     * 
     */
    public GetCoremetricsSessionID createGetCoremetricsSessionID() {
        return new GetCoremetricsSessionID();
    }

    /**
     * Create an instance of {@link GetCoremetricsSessionIDResponse }
     * 
     */
    public GetCoremetricsSessionIDResponse createGetCoremetricsSessionIDResponse() {
        return new GetCoremetricsSessionIDResponse();
    }

    /**
     * Create an instance of {@link SendTrackingData }
     * 
     */
    public SendTrackingData createSendTrackingData() {
        return new SendTrackingData();
    }

    /**
     * Create an instance of {@link SendTrackingDataResponse }
     * 
     */
    public SendTrackingDataResponse createSendTrackingDataResponse() {
        return new SendTrackingDataResponse();
    }

    /**
     * Create an instance of {@link SendConversionEventTrackingData }
     * 
     */
    public SendConversionEventTrackingData createSendConversionEventTrackingData() {
        return new SendConversionEventTrackingData();
    }

    /**
     * Create an instance of {@link SendConversionEventTrackingDataResponse }
     * 
     */
    public SendConversionEventTrackingDataResponse createSendConversionEventTrackingDataResponse() {
        return new SendConversionEventTrackingDataResponse();
    }

    /**
     * Create an instance of {@link RateItem }
     * 
     */
    public RateItem createRateItem() {
        return new RateItem();
    }

    /**
     * Create an instance of {@link RateItemResponse }
     * 
     */
    public RateItemResponse createRateItemResponse() {
        return new RateItemResponse();
    }

    /**
     * Create an instance of {@link SendPageViewTrackingData }
     * 
     */
    public SendPageViewTrackingData createSendPageViewTrackingData() {
        return new SendPageViewTrackingData();
    }

    /**
     * Create an instance of {@link SendPageViewTrackingDataResponse }
     * 
     */
    public SendPageViewTrackingDataResponse createSendPageViewTrackingDataResponse() {
        return new SendPageViewTrackingDataResponse();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendRecipeToEmail }
     * 
     */
    public SendRecipeToEmail createSendRecipeToEmail() {
        return new SendRecipeToEmail();
    }

    /**
     * Create an instance of {@link SendRecipeToEmailResponse }
     * 
     */
    public SendRecipeToEmailResponse createSendRecipeToEmailResponse() {
        return new SendRecipeToEmailResponse();
    }

    /**
     * Create an instance of {@link SendSMSMessage }
     * 
     */
    public SendSMSMessage createSendSMSMessage() {
        return new SendSMSMessage();
    }

    /**
     * Create an instance of {@link SendSMSMessageResponse }
     * 
     */
    public SendSMSMessageResponse createSendSMSMessageResponse() {
        return new SendSMSMessageResponse();
    }

    /**
     * Create an instance of {@link RateRecipe }
     * 
     */
    public RateRecipe createRateRecipe() {
        return new RateRecipe();
    }

    /**
     * Create an instance of {@link RateRecipeResponse }
     * 
     */
    public RateRecipeResponse createRateRecipeResponse() {
        return new RateRecipeResponse();
    }

    /**
     * Create an instance of {@link GetTopTenRecipes }
     * 
     */
    public GetTopTenRecipes createGetTopTenRecipes() {
        return new GetTopTenRecipes();
    }

    /**
     * Create an instance of {@link GetTopTenRecipesResponse }
     * 
     */
    public GetTopTenRecipesResponse createGetTopTenRecipesResponse() {
        return new GetTopTenRecipesResponse();
    }

    /**
     * Create an instance of {@link GetTopTenRecipesByCategory }
     * 
     */
    public GetTopTenRecipesByCategory createGetTopTenRecipesByCategory() {
        return new GetTopTenRecipesByCategory();
    }

    /**
     * Create an instance of {@link GetTopTenRecipesByCategoryResponse }
     * 
     */
    public GetTopTenRecipesByCategoryResponse createGetTopTenRecipesByCategoryResponse() {
        return new GetTopTenRecipesByCategoryResponse();
    }

    /**
     * Create an instance of {@link GetWYDRecipes }
     * 
     */
    public GetWYDRecipes createGetWYDRecipes() {
        return new GetWYDRecipes();
    }

    /**
     * Create an instance of {@link GetWYDRecipesResponse }
     * 
     */
    public GetWYDRecipesResponse createGetWYDRecipesResponse() {
        return new GetWYDRecipesResponse();
    }

    /**
     * Create an instance of {@link GetCookingVideos }
     * 
     */
    public GetCookingVideos createGetCookingVideos() {
        return new GetCookingVideos();
    }

    /**
     * Create an instance of {@link GetCookingVideosResponse }
     * 
     */
    public GetCookingVideosResponse createGetCookingVideosResponse() {
        return new GetCookingVideosResponse();
    }

    /**
     * Create an instance of {@link VideoRecipeSummariesResponse }
     * 
     */
    public VideoRecipeSummariesResponse createVideoRecipeSummariesResponse() {
        return new VideoRecipeSummariesResponse();
    }

    /**
     * Create an instance of {@link GetDinnerTonight }
     * 
     */
    public GetDinnerTonight createGetDinnerTonight() {
        return new GetDinnerTonight();
    }

    /**
     * Create an instance of {@link GetDinnerTonightResponse }
     * 
     */
    public GetDinnerTonightResponse createGetDinnerTonightResponse() {
        return new GetDinnerTonightResponse();
    }

    /**
     * Create an instance of {@link DTSummariesResponse }
     * 
     */
    public DTSummariesResponse createDTSummariesResponse() {
        return new DTSummariesResponse();
    }

    /**
     * Create an instance of {@link GetDinnerTonightForWeek }
     * 
     */
    public GetDinnerTonightForWeek createGetDinnerTonightForWeek() {
        return new GetDinnerTonightForWeek();
    }

    /**
     * Create an instance of {@link GetDinnerTonightForWeekResponse }
     * 
     */
    public GetDinnerTonightForWeekResponse createGetDinnerTonightForWeekResponse() {
        return new GetDinnerTonightForWeekResponse();
    }

    /**
     * Create an instance of {@link GetCookingVideoForRecipeID }
     * 
     */
    public GetCookingVideoForRecipeID createGetCookingVideoForRecipeID() {
        return new GetCookingVideoForRecipeID();
    }

    /**
     * Create an instance of {@link GetCookingVideoForRecipeIDResponse }
     * 
     */
    public GetCookingVideoForRecipeIDResponse createGetCookingVideoForRecipeIDResponse() {
        return new GetCookingVideoForRecipeIDResponse();
    }

    /**
     * Create an instance of {@link GetWYDRecipeSubCategory }
     * 
     */
    public GetWYDRecipeSubCategory createGetWYDRecipeSubCategory() {
        return new GetWYDRecipeSubCategory();
    }

    /**
     * Create an instance of {@link GetWYDRecipeSubCategoryResponse }
     * 
     */
    public GetWYDRecipeSubCategoryResponse createGetWYDRecipeSubCategoryResponse() {
        return new GetWYDRecipeSubCategoryResponse();
    }

    /**
     * Create an instance of {@link RecipeSubCategoryResponse }
     * 
     */
    public RecipeSubCategoryResponse createRecipeSubCategoryResponse() {
        return new RecipeSubCategoryResponse();
    }

    /**
     * Create an instance of {@link GetCookingVideosSubCategory }
     * 
     */
    public GetCookingVideosSubCategory createGetCookingVideosSubCategory() {
        return new GetCookingVideosSubCategory();
    }

    /**
     * Create an instance of {@link GetCookingVideosSubCategoryResponse }
     * 
     */
    public GetCookingVideosSubCategoryResponse createGetCookingVideosSubCategoryResponse() {
        return new GetCookingVideosSubCategoryResponse();
    }

    /**
     * Create an instance of {@link GetPollsByPollIDs }
     * 
     */
    public GetPollsByPollIDs createGetPollsByPollIDs() {
        return new GetPollsByPollIDs();
    }

    /**
     * Create an instance of {@link GetPollsByPollIDsResponse }
     * 
     */
    public GetPollsByPollIDsResponse createGetPollsByPollIDsResponse() {
        return new GetPollsByPollIDsResponse();
    }

    /**
     * Create an instance of {@link PollDetailsResponse }
     * 
     */
    public PollDetailsResponse createPollDetailsResponse() {
        return new PollDetailsResponse();
    }

    /**
     * Create an instance of {@link GetPollsByRelationID }
     * 
     */
    public GetPollsByRelationID createGetPollsByRelationID() {
        return new GetPollsByRelationID();
    }

    /**
     * Create an instance of {@link GetPollsByRelationIDResponse }
     * 
     */
    public GetPollsByRelationIDResponse createGetPollsByRelationIDResponse() {
        return new GetPollsByRelationIDResponse();
    }

    /**
     * Create an instance of {@link TestJSON }
     * 
     */
    public TestJSON createTestJSON() {
        return new TestJSON();
    }

    /**
     * Create an instance of {@link TestJSONResponse }
     * 
     */
    public TestJSONResponse createTestJSONResponse() {
        return new TestJSONResponse();
    }

    /**
     * Create an instance of {@link AnswerPoll }
     * 
     */
    public AnswerPoll createAnswerPoll() {
        return new AnswerPoll();
    }

    /**
     * Create an instance of {@link AnswerPollResponse }
     * 
     */
    public AnswerPollResponse createAnswerPollResponse() {
        return new AnswerPollResponse();
    }

    /**
     * Create an instance of {@link GetNodesByCategoryList }
     * 
     */
    public GetNodesByCategoryList createGetNodesByCategoryList() {
        return new GetNodesByCategoryList();
    }

    /**
     * Create an instance of {@link GetNodesByCategoryListResponse }
     * 
     */
    public GetNodesByCategoryListResponse createGetNodesByCategoryListResponse() {
        return new GetNodesByCategoryListResponse();
    }

    /**
     * Create an instance of {@link GetSiteUserAcctPointsLeft }
     * 
     */
    public GetSiteUserAcctPointsLeft createGetSiteUserAcctPointsLeft() {
        return new GetSiteUserAcctPointsLeft();
    }

    /**
     * Create an instance of {@link GetSiteUserAcctPointsLeftResponse }
     * 
     */
    public GetSiteUserAcctPointsLeftResponse createGetSiteUserAcctPointsLeftResponse() {
        return new GetSiteUserAcctPointsLeftResponse();
    }

    /**
     * Create an instance of {@link SiteUserAcctPointsLeftResponse }
     * 
     */
    public SiteUserAcctPointsLeftResponse createSiteUserAcctPointsLeftResponse() {
        return new SiteUserAcctPointsLeftResponse();
    }

    /**
     * Create an instance of {@link GetRecipesByDates }
     * 
     */
    public GetRecipesByDates createGetRecipesByDates() {
        return new GetRecipesByDates();
    }

    /**
     * Create an instance of {@link GetRecipesByDatesResponse }
     * 
     */
    public GetRecipesByDatesResponse createGetRecipesByDatesResponse() {
        return new GetRecipesByDatesResponse();
    }

    /**
     * Create an instance of {@link RecipeSummaryDetailsResponse }
     * 
     */
    public RecipeSummaryDetailsResponse createRecipeSummaryDetailsResponse() {
        return new RecipeSummaryDetailsResponse();
    }

    /**
     * Create an instance of {@link GetTraditionalRecipesByDates }
     * 
     */
    public GetTraditionalRecipesByDates createGetTraditionalRecipesByDates() {
        return new GetTraditionalRecipesByDates();
    }

    /**
     * Create an instance of {@link GetTraditionalRecipesByDatesResponse }
     * 
     */
    public GetTraditionalRecipesByDatesResponse createGetTraditionalRecipesByDatesResponse() {
        return new GetTraditionalRecipesByDatesResponse();
    }

    /**
     * Create an instance of {@link RecipeDetailResponses }
     * 
     */
    public RecipeDetailResponses createRecipeDetailResponses() {
        return new RecipeDetailResponses();
    }

    /**
     * Create an instance of {@link UserOptin }
     * 
     */
    public UserOptin createUserOptin() {
        return new UserOptin();
    }

    /**
     * Create an instance of {@link UserOptinResponse }
     * 
     */
    public UserOptinResponse createUserOptinResponse() {
        return new UserOptinResponse();
    }

    /**
     * Create an instance of {@link OptinSummaryResponse }
     * 
     */
    public OptinSummaryResponse createOptinSummaryResponse() {
        return new OptinSummaryResponse();
    }

    /**
     * Create an instance of {@link UserAnswerUpdate }
     * 
     */
    public UserAnswerUpdate createUserAnswerUpdate() {
        return new UserAnswerUpdate();
    }

    /**
     * Create an instance of {@link UserAnswerUpdateResponse }
     * 
     */
    public UserAnswerUpdateResponse createUserAnswerUpdateResponse() {
        return new UserAnswerUpdateResponse();
    }

    /**
     * Create an instance of {@link UpadteUserAnswerResponse }
     * 
     */
    public UpadteUserAnswerResponse createUpadteUserAnswerResponse() {
        return new UpadteUserAnswerResponse();
    }

    /**
     * Create an instance of {@link UserOptinUpdate }
     * 
     */
    public UserOptinUpdate createUserOptinUpdate() {
        return new UserOptinUpdate();
    }

    /**
     * Create an instance of {@link UserOptinUpdateResponse }
     * 
     */
    public UserOptinUpdateResponse createUserOptinUpdateResponse() {
        return new UserOptinUpdateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeSummary }
     * 
     */
    public ArrayOfRecipeSummary createArrayOfRecipeSummary() {
        return new ArrayOfRecipeSummary();
    }

    /**
     * Create an instance of {@link RecipeSummary }
     * 
     */
    public RecipeSummary createRecipeSummary() {
        return new RecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeClassification }
     * 
     */
    public ArrayOfRecipeClassification createArrayOfRecipeClassification() {
        return new ArrayOfRecipeClassification();
    }

    /**
     * Create an instance of {@link RecipeClassification }
     * 
     */
    public RecipeClassification createRecipeClassification() {
        return new RecipeClassification();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeCategory }
     * 
     */
    public ArrayOfRecipeCategory createArrayOfRecipeCategory() {
        return new ArrayOfRecipeCategory();
    }

    /**
     * Create an instance of {@link RecipeCategory }
     * 
     */
    public RecipeCategory createRecipeCategory() {
        return new RecipeCategory();
    }

    /**
     * Create an instance of {@link ArrayOfCookingVideoAd }
     * 
     */
    public ArrayOfCookingVideoAd createArrayOfCookingVideoAd() {
        return new ArrayOfCookingVideoAd();
    }

    /**
     * Create an instance of {@link CookingVideoAd }
     * 
     */
    public CookingVideoAd createCookingVideoAd() {
        return new CookingVideoAd();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeFlashVideo }
     * 
     */
    public ArrayOfRecipeFlashVideo createArrayOfRecipeFlashVideo() {
        return new ArrayOfRecipeFlashVideo();
    }

    /**
     * Create an instance of {@link RecipeFlashVideo }
     * 
     */
    public RecipeFlashVideo createRecipeFlashVideo() {
        return new RecipeFlashVideo();
    }

    /**
     * Create an instance of {@link ArrayOfROTDSummary }
     * 
     */
    public ArrayOfROTDSummary createArrayOfROTDSummary() {
        return new ArrayOfROTDSummary();
    }

    /**
     * Create an instance of {@link ROTDSummary }
     * 
     */
    public ROTDSummary createROTDSummary() {
        return new ROTDSummary();
    }

    /**
     * Create an instance of {@link MemberRecipeDetail }
     * 
     */
    public MemberRecipeDetail createMemberRecipeDetail() {
        return new MemberRecipeDetail();
    }

    /**
     * Create an instance of {@link MemberRecipeSummary }
     * 
     */
    public MemberRecipeSummary createMemberRecipeSummary() {
        return new MemberRecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfRatingDetail }
     * 
     */
    public ArrayOfRatingDetail createArrayOfRatingDetail() {
        return new ArrayOfRatingDetail();
    }

    /**
     * Create an instance of {@link RatingDetail }
     * 
     */
    public RatingDetail createRatingDetail() {
        return new RatingDetail();
    }

    /**
     * Create an instance of {@link RecipeDetail }
     * 
     */
    public RecipeDetail createRecipeDetail() {
        return new RecipeDetail();
    }

    /**
     * Create an instance of {@link ArrayOfIngredientDetail }
     * 
     */
    public ArrayOfIngredientDetail createArrayOfIngredientDetail() {
        return new ArrayOfIngredientDetail();
    }

    /**
     * Create an instance of {@link IngredientDetail }
     * 
     */
    public IngredientDetail createIngredientDetail() {
        return new IngredientDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeIngredientGridHeaderDetail }
     * 
     */
    public ArrayOfRecipeIngredientGridHeaderDetail createArrayOfRecipeIngredientGridHeaderDetail() {
        return new ArrayOfRecipeIngredientGridHeaderDetail();
    }

    /**
     * Create an instance of {@link RecipeIngredientGridHeaderDetail }
     * 
     */
    public RecipeIngredientGridHeaderDetail createRecipeIngredientGridHeaderDetail() {
        return new RecipeIngredientGridHeaderDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeIngredientGridDetail }
     * 
     */
    public ArrayOfRecipeIngredientGridDetail createArrayOfRecipeIngredientGridDetail() {
        return new ArrayOfRecipeIngredientGridDetail();
    }

    /**
     * Create an instance of {@link RecipeIngredientGridDetail }
     * 
     */
    public RecipeIngredientGridDetail createRecipeIngredientGridDetail() {
        return new RecipeIngredientGridDetail();
    }

    /**
     * Create an instance of {@link ArrayOfPreparationDetail }
     * 
     */
    public ArrayOfPreparationDetail createArrayOfPreparationDetail() {
        return new ArrayOfPreparationDetail();
    }

    /**
     * Create an instance of {@link PreparationDetail }
     * 
     */
    public PreparationDetail createPreparationDetail() {
        return new PreparationDetail();
    }

    /**
     * Create an instance of {@link ArrayOfNutritionItemDetail }
     * 
     */
    public ArrayOfNutritionItemDetail createArrayOfNutritionItemDetail() {
        return new ArrayOfNutritionItemDetail();
    }

    /**
     * Create an instance of {@link NutritionItemDetail }
     * 
     */
    public NutritionItemDetail createNutritionItemDetail() {
        return new NutritionItemDetail();
    }

    /**
     * Create an instance of {@link ArrayOfNutritionGridItemDetail }
     * 
     */
    public ArrayOfNutritionGridItemDetail createArrayOfNutritionGridItemDetail() {
        return new ArrayOfNutritionGridItemDetail();
    }

    /**
     * Create an instance of {@link NutritionGridItemDetail }
     * 
     */
    public NutritionGridItemDetail createNutritionGridItemDetail() {
        return new NutritionGridItemDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeTipDetail }
     * 
     */
    public ArrayOfRecipeTipDetail createArrayOfRecipeTipDetail() {
        return new ArrayOfRecipeTipDetail();
    }

    /**
     * Create an instance of {@link RecipeTipDetail }
     * 
     */
    public RecipeTipDetail createRecipeTipDetail() {
        return new RecipeTipDetail();
    }

    /**
     * Create an instance of {@link CookieResponseEntity }
     * 
     */
    public CookieResponseEntity createCookieResponseEntity() {
        return new CookieResponseEntity();
    }

    /**
     * Create an instance of {@link CookiePairs }
     * 
     */
    public CookiePairs createCookiePairs() {
        return new CookiePairs();
    }

    /**
     * Create an instance of {@link CookiePair }
     * 
     */
    public CookiePair createCookiePair() {
        return new CookiePair();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeBoxRecipeSummary }
     * 
     */
    public ArrayOfRecipeBoxRecipeSummary createArrayOfRecipeBoxRecipeSummary() {
        return new ArrayOfRecipeBoxRecipeSummary();
    }

    /**
     * Create an instance of {@link RecipeBoxRecipeSummary }
     * 
     */
    public RecipeBoxRecipeSummary createRecipeBoxRecipeSummary() {
        return new RecipeBoxRecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfShoppingList }
     * 
     */
    public ArrayOfShoppingList createArrayOfShoppingList() {
        return new ArrayOfShoppingList();
    }

    /**
     * Create an instance of {@link ShoppingList }
     * 
     */
    public ShoppingList createShoppingList() {
        return new ShoppingList();
    }

    /**
     * Create an instance of {@link ArrayOfShoppingListItem }
     * 
     */
    public ArrayOfShoppingListItem createArrayOfShoppingListItem() {
        return new ArrayOfShoppingListItem();
    }

    /**
     * Create an instance of {@link ShoppingListItem }
     * 
     */
    public ShoppingListItem createShoppingListItem() {
        return new ShoppingListItem();
    }

    /**
     * Create an instance of {@link ArrayOfAddItemToShoppingListResult }
     * 
     */
    public ArrayOfAddItemToShoppingListResult createArrayOfAddItemToShoppingListResult() {
        return new ArrayOfAddItemToShoppingListResult();
    }

    /**
     * Create an instance of {@link AddItemToShoppingListResult }
     * 
     */
    public AddItemToShoppingListResult createAddItemToShoppingListResult() {
        return new AddItemToShoppingListResult();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeBoxShoppingListResponse }
     * 
     */
    public ArrayOfRecipeBoxShoppingListResponse createArrayOfRecipeBoxShoppingListResponse() {
        return new ArrayOfRecipeBoxShoppingListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStoreSummary }
     * 
     */
    public ArrayOfStoreSummary createArrayOfStoreSummary() {
        return new ArrayOfStoreSummary();
    }

    /**
     * Create an instance of {@link StoreSummary }
     * 
     */
    public StoreSummary createStoreSummary() {
        return new StoreSummary();
    }

    /**
     * Create an instance of {@link ArrayOfVideoRecipeSummary }
     * 
     */
    public ArrayOfVideoRecipeSummary createArrayOfVideoRecipeSummary() {
        return new ArrayOfVideoRecipeSummary();
    }

    /**
     * Create an instance of {@link VideoRecipeSummary }
     * 
     */
    public VideoRecipeSummary createVideoRecipeSummary() {
        return new VideoRecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfDTSummary }
     * 
     */
    public ArrayOfDTSummary createArrayOfDTSummary() {
        return new ArrayOfDTSummary();
    }

    /**
     * Create an instance of {@link DTSummary }
     * 
     */
    public DTSummary createDTSummary() {
        return new DTSummary();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeSubCategory }
     * 
     */
    public ArrayOfRecipeSubCategory createArrayOfRecipeSubCategory() {
        return new ArrayOfRecipeSubCategory();
    }

    /**
     * Create an instance of {@link RecipeSubCategory }
     * 
     */
    public RecipeSubCategory createRecipeSubCategory() {
        return new RecipeSubCategory();
    }

    /**
     * Create an instance of {@link ArrayOfPollDetail }
     * 
     */
    public ArrayOfPollDetail createArrayOfPollDetail() {
        return new ArrayOfPollDetail();
    }

    /**
     * Create an instance of {@link PollDetail }
     * 
     */
    public PollDetail createPollDetail() {
        return new PollDetail();
    }

    /**
     * Create an instance of {@link ArrayOfPollResultDetail }
     * 
     */
    public ArrayOfPollResultDetail createArrayOfPollResultDetail() {
        return new ArrayOfPollResultDetail();
    }

    /**
     * Create an instance of {@link PollResultDetail }
     * 
     */
    public PollResultDetail createPollResultDetail() {
        return new PollResultDetail();
    }

    /**
     * Create an instance of {@link RecipeSubCategoryResponseWPT }
     * 
     */
    public RecipeSubCategoryResponseWPT createRecipeSubCategoryResponseWPT() {
        return new RecipeSubCategoryResponseWPT();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeSubCategoryWPT }
     * 
     */
    public ArrayOfRecipeSubCategoryWPT createArrayOfRecipeSubCategoryWPT() {
        return new ArrayOfRecipeSubCategoryWPT();
    }

    /**
     * Create an instance of {@link RecipeSubCategoryWPT }
     * 
     */
    public RecipeSubCategoryWPT createRecipeSubCategoryWPT() {
        return new RecipeSubCategoryWPT();
    }

    /**
     * Create an instance of {@link TextResponse }
     * 
     */
    public TextResponse createTextResponse() {
        return new TextResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTextSummary }
     * 
     */
    public ArrayOfTextSummary createArrayOfTextSummary() {
        return new ArrayOfTextSummary();
    }

    /**
     * Create an instance of {@link TextSummary }
     * 
     */
    public TextSummary createTextSummary() {
        return new TextSummary();
    }

    /**
     * Create an instance of {@link BrandRecipeSummariesResponse }
     * 
     */
    public BrandRecipeSummariesResponse createBrandRecipeSummariesResponse() {
        return new BrandRecipeSummariesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBrandRecipeSummary }
     * 
     */
    public ArrayOfBrandRecipeSummary createArrayOfBrandRecipeSummary() {
        return new ArrayOfBrandRecipeSummary();
    }

    /**
     * Create an instance of {@link BrandRecipeSummary }
     * 
     */
    public BrandRecipeSummary createBrandRecipeSummary() {
        return new BrandRecipeSummary();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeSummaryDetails }
     * 
     */
    public ArrayOfRecipeSummaryDetails createArrayOfRecipeSummaryDetails() {
        return new ArrayOfRecipeSummaryDetails();
    }

    /**
     * Create an instance of {@link RecipeSummaryDetails }
     * 
     */
    public RecipeSummaryDetails createRecipeSummaryDetails() {
        return new RecipeSummaryDetails();
    }

    /**
     * Create an instance of {@link ArrayOfRecipeDetail }
     * 
     */
    public ArrayOfRecipeDetail createArrayOfRecipeDetail() {
        return new ArrayOfRecipeDetail();
    }

    /**
     * Create an instance of {@link ArrayOfOptinResponse }
     * 
     */
    public ArrayOfOptinResponse createArrayOfOptinResponse() {
        return new ArrayOfOptinResponse();
    }

    /**
     * Create an instance of {@link OptinResponse }
     * 
     */
    public OptinResponse createOptinResponse() {
        return new OptinResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeSummariesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeSummariesResponse")
    public JAXBElement<RecipeSummariesResponse> createRecipeSummariesResponse(RecipeSummariesResponse value) {
        return new JAXBElement<RecipeSummariesResponse>(_RecipeSummariesResponse_QNAME, RecipeSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "GetRecipeCategoryResponse")
    public JAXBElement<GetRecipeCategoryResponse> createGetRecipeCategoryResponse(GetRecipeCategoryResponse value) {
        return new JAXBElement<GetRecipeCategoryResponse>(_GetRecipeCategoryResponse_QNAME, GetRecipeCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeClassificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "GetRecipeClassificationResponse")
    public JAXBElement<GetRecipeClassificationResponse> createGetRecipeClassificationResponse(GetRecipeClassificationResponse value) {
        return new JAXBElement<GetRecipeClassificationResponse>(_GetRecipeClassificationResponse_QNAME, GetRecipeClassificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeSubCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "GetRecipeSubCategoryResponse")
    public JAXBElement<GetRecipeSubCategoryResponse> createGetRecipeSubCategoryResponse(GetRecipeSubCategoryResponse value) {
        return new JAXBElement<GetRecipeSubCategoryResponse>(_GetRecipeSubCategoryResponse_QNAME, GetRecipeSubCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeVideosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeVideosResponse")
    public JAXBElement<RecipeVideosResponse> createRecipeVideosResponse(RecipeVideosResponse value) {
        return new JAXBElement<RecipeVideosResponse>(_RecipeVideosResponse_QNAME, RecipeVideosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ROTDSummariesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "ROTDSummariesResponse")
    public JAXBElement<ROTDSummariesResponse> createROTDSummariesResponse(ROTDSummariesResponse value) {
        return new JAXBElement<ROTDSummariesResponse>(_ROTDSummariesResponse_QNAME, ROTDSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberRecipeDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "MemberRecipeDetailResponse")
    public JAXBElement<MemberRecipeDetailResponse> createMemberRecipeDetailResponse(MemberRecipeDetailResponse value) {
        return new JAXBElement<MemberRecipeDetailResponse>(_MemberRecipeDetailResponse_QNAME, MemberRecipeDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeDetailResponse")
    public JAXBElement<RecipeDetailResponse> createRecipeDetailResponse(RecipeDetailResponse value) {
        return new JAXBElement<RecipeDetailResponse>(_RecipeDetailResponse_QNAME, RecipeDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatingsPagedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RatingsPagedResponse")
    public JAXBElement<RatingsPagedResponse> createRatingsPagedResponse(RatingsPagedResponse value) {
        return new JAXBElement<RatingsPagedResponse>(_RatingsPagedResponse_QNAME, RatingsPagedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForgotPasswordCallResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "ForgotPasswordCallResponse")
    public JAXBElement<ForgotPasswordCallResponse> createForgotPasswordCallResponse(ForgotPasswordCallResponse value) {
        return new JAXBElement<ForgotPasswordCallResponse>(_ForgotPasswordCallResponse_QNAME, ForgotPasswordCallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "LogoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeBoxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeBoxResponse")
    public JAXBElement<RecipeBoxResponse> createRecipeBoxResponse(RecipeBoxResponse value) {
        return new JAXBElement<RecipeBoxResponse>(_RecipeBoxResponse_QNAME, RecipeBoxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "StatusResponse")
    public JAXBElement<StatusResponse> createStatusResponse(StatusResponse value) {
        return new JAXBElement<StatusResponse>(_StatusResponse_QNAME, StatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeBoxRecipeSummariesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeBoxRecipeSummariesResponse")
    public JAXBElement<RecipeBoxRecipeSummariesResponse> createRecipeBoxRecipeSummariesResponse(RecipeBoxRecipeSummariesResponse value) {
        return new JAXBElement<RecipeBoxRecipeSummariesResponse>(_RecipeBoxRecipeSummariesResponse_QNAME, RecipeBoxRecipeSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeInRecipeBoxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeInRecipeBoxResponse")
    public JAXBElement<RecipeInRecipeBoxResponse> createRecipeInRecipeBoxResponse(RecipeInRecipeBoxResponse value) {
        return new JAXBElement<RecipeInRecipeBoxResponse>(_RecipeInRecipeBoxResponse_QNAME, RecipeInRecipeBoxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingListsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "ShoppingListsResponse")
    public JAXBElement<ShoppingListsResponse> createShoppingListsResponse(ShoppingListsResponse value) {
        return new JAXBElement<ShoppingListsResponse>(_ShoppingListsResponse_QNAME, ShoppingListsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "ShoppingListResponse")
    public JAXBElement<ShoppingListResponse> createShoppingListResponse(ShoppingListResponse value) {
        return new JAXBElement<ShoppingListResponse>(_ShoppingListResponse_QNAME, ShoppingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortedShoppingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "SortedShoppingListResponse")
    public JAXBElement<SortedShoppingListResponse> createSortedShoppingListResponse(SortedShoppingListResponse value) {
        return new JAXBElement<SortedShoppingListResponse>(_SortedShoppingListResponse_QNAME, SortedShoppingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditShoppingListItemResponseNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "EditShoppingListItemResponseNew")
    public JAXBElement<EditShoppingListItemResponseNew> createEditShoppingListItemResponseNew(EditShoppingListItemResponseNew value) {
        return new JAXBElement<EditShoppingListItemResponseNew>(_EditShoppingListItemResponseNew_QNAME, EditShoppingListItemResponseNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItemToShoppingListResponseNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "AddItemToShoppingListResponseNew")
    public JAXBElement<AddItemToShoppingListResponseNew> createAddItemToShoppingListResponseNew(AddItemToShoppingListResponseNew value) {
        return new JAXBElement<AddItemToShoppingListResponseNew>(_AddItemToShoppingListResponseNew_QNAME, AddItemToShoppingListResponseNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeBoxShoppingListResponses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeBoxShoppingListResponses")
    public JAXBElement<RecipeBoxShoppingListResponses> createRecipeBoxShoppingListResponses(RecipeBoxShoppingListResponses value) {
        return new JAXBElement<RecipeBoxShoppingListResponses>(_RecipeBoxShoppingListResponses_QNAME, RecipeBoxShoppingListResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeBoxShoppingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeBoxShoppingListResponse")
    public JAXBElement<RecipeBoxShoppingListResponse> createRecipeBoxShoppingListResponse(RecipeBoxShoppingListResponse value) {
        return new JAXBElement<RecipeBoxShoppingListResponse>(_RecipeBoxShoppingListResponse_QNAME, RecipeBoxShoppingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreSummariesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "StoreSummariesResponse")
    public JAXBElement<StoreSummariesResponse> createStoreSummariesResponse(StoreSummariesResponse value) {
        return new JAXBElement<StoreSummariesResponse>(_StoreSummariesResponse_QNAME, StoreSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoremetricsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "CoremetricsResponse")
    public JAXBElement<CoremetricsResponse> createCoremetricsResponse(CoremetricsResponse value) {
        return new JAXBElement<CoremetricsResponse>(_CoremetricsResponse_QNAME, CoremetricsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoRecipeSummariesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "VideoRecipeSummariesResponse")
    public JAXBElement<VideoRecipeSummariesResponse> createVideoRecipeSummariesResponse(VideoRecipeSummariesResponse value) {
        return new JAXBElement<VideoRecipeSummariesResponse>(_VideoRecipeSummariesResponse_QNAME, VideoRecipeSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTSummariesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "DTSummariesResponse")
    public JAXBElement<DTSummariesResponse> createDTSummariesResponse(DTSummariesResponse value) {
        return new JAXBElement<DTSummariesResponse>(_DTSummariesResponse_QNAME, DTSummariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeSubCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeSubCategoryResponse")
    public JAXBElement<RecipeSubCategoryResponse> createRecipeSubCategoryResponse(RecipeSubCategoryResponse value) {
        return new JAXBElement<RecipeSubCategoryResponse>(_RecipeSubCategoryResponse_QNAME, RecipeSubCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PollDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "PollDetailsResponse")
    public JAXBElement<PollDetailsResponse> createPollDetailsResponse(PollDetailsResponse value) {
        return new JAXBElement<PollDetailsResponse>(_PollDetailsResponse_QNAME, PollDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteUserAcctPointsLeftResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "SiteUserAcctPointsLeftResponse")
    public JAXBElement<SiteUserAcctPointsLeftResponse> createSiteUserAcctPointsLeftResponse(SiteUserAcctPointsLeftResponse value) {
        return new JAXBElement<SiteUserAcctPointsLeftResponse>(_SiteUserAcctPointsLeftResponse_QNAME, SiteUserAcctPointsLeftResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeSummaryDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeSummaryDetailsResponse")
    public JAXBElement<RecipeSummaryDetailsResponse> createRecipeSummaryDetailsResponse(RecipeSummaryDetailsResponse value) {
        return new JAXBElement<RecipeSummaryDetailsResponse>(_RecipeSummaryDetailsResponse_QNAME, RecipeSummaryDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecipeDetailResponses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "RecipeDetailResponses")
    public JAXBElement<RecipeDetailResponses> createRecipeDetailResponses(RecipeDetailResponses value) {
        return new JAXBElement<RecipeDetailResponses>(_RecipeDetailResponses_QNAME, RecipeDetailResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptinSummaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "OptinSummaryResponse")
    public JAXBElement<OptinSummaryResponse> createOptinSummaryResponse(OptinSummaryResponse value) {
        return new JAXBElement<OptinSummaryResponse>(_OptinSummaryResponse_QNAME, OptinSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpadteUserAnswerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kraftfoods.com/ws/", name = "UpadteUserAnswerResponse")
    public JAXBElement<UpadteUserAnswerResponse> createUpadteUserAnswerResponse(UpadteUserAnswerResponse value) {
        return new JAXBElement<UpadteUserAnswerResponse>(_UpadteUserAnswerResponse_QNAME, UpadteUserAnswerResponse.class, null, value);
    }

}
